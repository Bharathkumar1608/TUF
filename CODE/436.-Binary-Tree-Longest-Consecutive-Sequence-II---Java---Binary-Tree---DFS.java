class Solution
{
    int maxLength = 0;

    public int longestConsecutive(TreeNode root)
    {
        maxLength = 0;

        dfs(root);

        return maxLength;
    }

    private int[] dfs(TreeNode node)
    {
        if(node == null)
        {
            return new int[]{0, 0};
        }
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        int inc = 1;
        int dec = 1;
        // Check left child
        if(node.left != null)
        {
            if(node.left.val == node.val + 1)
            {
                inc = Math.max(inc, left[0] + 1);
            }
            else if(node.left.val == node.val - 1)
            {
                dec = Math.max(dec, left[1] + 1);
            }
        }
        // Check right child
        if(node.right != null)
        {
            if(node.right.val == node.val + 1)
            {
                inc = Math.max(inc, right[0] + 1);
            }
            else if(node.right.val == node.val - 1)
            {
                dec = Math.max(dec, right[1] + 1);
            }
        }
        // Longest path passing through current node
        maxLength = Math.max(maxLength, inc + dec - 1);
        return new int[]{inc, dec};
    }
}
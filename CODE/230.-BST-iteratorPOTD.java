 = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    public void pushLeft(TreeNode root) {
        while (root != null) {
            st.push(root);
            root = root.left;
        }
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    public int next() {
        TreeNode node = st.pop();
        int ans = node.data;

        if (node.right != null) {
            pushLeft(node.right);
        }

        return ans;
    }
}

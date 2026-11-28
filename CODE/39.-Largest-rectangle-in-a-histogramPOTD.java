class Solution {
    public int largestRectangleArea(int[] heights) {
       int n=heights.length;
       int max=0;
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<=n;i++){
            int cur=0;
            if(i!=n){
                cur=heights[i];
            }
            while(!st.isEmpty() && heights[st.peek()]>cur){
                int h=heights[st.pop()];
                int l=st.isEmpty()?-1:st.peek();
                int w=i-l-1;
                max=Math.max(max,(h*w));
            }
            if(i<n){
                st.push(i);
            }
       }
       return max;
    }
}

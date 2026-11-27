class Solution {
    public int[] stockSpan(int[] arr, int n) {
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=i+1;
            }
            else{
                res[i]=i-st.peek();
            }
            st.push(i);
        }
        return res;
    }
}


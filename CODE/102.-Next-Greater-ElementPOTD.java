class Solution {
    public int[] nextLargerElement(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        res[n-1]=-1;
        for(int i=0;i<n-1;i++){
            int nm=-1;
            int ind=i+1;
            while(ind<n){
                if(arr[i]<arr[ind]){
                    nm=arr[ind];
                    break;
                }
                ind++;
            }
            res[i]=nm;
        }
        return res;
    }
}
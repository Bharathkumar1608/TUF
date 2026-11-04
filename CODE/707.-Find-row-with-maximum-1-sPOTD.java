class Solution {
    public int rowWithMax1s(int[][] mat) {
       int max=0;
       int mai=-1;
       for(int i=0;i<mat.length;i++){
            if(find(mat[i])>max){
                max=find(mat[i]);
                mai=i;
            }
       }
       return mai;
    }
    static int find(int[] row){
        int cnt=0;
        for(int x:row){
            if(x==1){
                cnt++;
            }
        }
        return cnt;
    }
}
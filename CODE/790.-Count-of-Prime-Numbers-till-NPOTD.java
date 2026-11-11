class Solution {
    public int primeUptoN(int n) {
        Boolean[] arr=new Boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        int cnt=0;
        for(int i=2;i<=n;i++){
            if(arr[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
class Solution {
    public int LIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int max=1;
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                    }
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}


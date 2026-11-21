class Solution {
    public int longestSubarray(int[] nums, int k) {
       int n=nums.length;
       int[] ps=new int[n];
       ps[0]=nums[0];
       for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
       }
       int max=Integer.MIN_VALUE;
       //int l=0;
       for(int i=0;i<n;i++){
        int l=0;
        int sum=ps[i];
        while(sum>k && l<i){
            sum-=nums[l];
            l++;
        }
        if(sum==k){
            max=Math.max(max,i-l+1);
        }
       }
       return max==Integer.MAX_VALUE?0:max;
    }
}
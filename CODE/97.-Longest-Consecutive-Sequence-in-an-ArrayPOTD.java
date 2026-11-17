class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=1;
        int res=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==nums[i-1]){
                max++;
            }
            else if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                max=1;
            }
            res=Math.max(res,max);
        }
        return res;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int r=target-nums[i];
            if(map.containsKey(r)){
                arr[0]=map.get(r);
                arr[1]=i;
                return arr;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}
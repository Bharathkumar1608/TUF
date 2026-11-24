class Solution {
    public int search(int[] nums, int k) {
        int n=nums.length;
        int ind=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                ind=i;
                break;
            }
        }
        if(ind==0){
            ind=n;
        }
        int pos=-1;
        if(nums[0]<=k && k<=nums[ind-1]){
            for(int i=0;i<ind-1;i++){
                if(nums[i]==k){
                    pos=i;
                    return i;
                }
            }
        }
        else{
            for(int i=ind;i<n;i++){
                if(nums[i]==k){
                    pos=i;
                    return i;
                }
            }
        }
        return pos;
    }
}

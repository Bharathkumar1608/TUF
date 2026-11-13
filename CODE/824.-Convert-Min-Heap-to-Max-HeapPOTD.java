class Solution {
    public int[] minToMaxHeap(int[] nums) {
        int n=nums.length;
        for(int i=(n/2)-1;i>=0;i--){
            heapify(nums,n,i);
        }
        return nums;

    }
    static void heapify(int[] arr,int n,int i){
        int large=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[large]){
            large=left;
        }
        if(right<n && arr[right]>arr[large]){
            large=right;
        }
        if(large!=i){
            int temp=arr[i];
            arr[i]=arr[large];
            arr[large]=temp;
            heapify(arr,n,large);
        }
    }
}
class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums2.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(nums1[i]);
        }
        return arr;
    }
}
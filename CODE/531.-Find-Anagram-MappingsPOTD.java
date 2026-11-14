class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int n=nums2.length;
        int[] arr=new int[n];
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                map.get(nums2[i]).add(i);
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(nums2[i],list);
            }
        }
        for(int i=0;i<n;i++){
            int data=map.get(nums1[i]).get(0);
            map.get(nums1[i]).remove(0);
            arr[i]=data;
        }
        return arr;
    }
}
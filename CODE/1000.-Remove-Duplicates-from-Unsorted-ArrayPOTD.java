class Solution {
    public List<Integer> removeDuplicates(List<Integer> arr) {
        List<Integer> list=new ArrayList<>();
        int n=arr.size();
        for(int i=0;i<n;i++){

            if(!list.contains(arr.get(i))){

                list.add(arr.get(i));
            }
            
        }
        return list;
    }
}
class Solution {    
    public List<Character> frequencySort(String s) {
        List<Character> list=new ArrayList<>();
        int[][] arr=new int[26][2];
        for(int i=0;i<26;i++){
            arr[i][0]=i;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            int n=ch-'a';
            arr[n][1]++;
        }
        Arrays.sort(arr,(a,b)->b[1]-a[1]);
        for(int i=0;i<26;i++){
            if(arr[i][1]!=0){
                int n=arr[i][0];
                char ch=(char)(n+'a');
                list.add(ch);
            }
        }
        return list;
    }
}
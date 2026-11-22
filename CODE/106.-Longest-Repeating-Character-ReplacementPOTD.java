class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] arr=new int[26];
        int maxfreq=0;
        int l=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            arr[ch-'A']++;
            maxfreq=Math.max(maxfreq,arr[ch-'A']);
            while((i-l+1)-maxfreq>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}
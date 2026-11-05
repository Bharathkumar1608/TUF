class Solution {
    public String toggleCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                ch=Character.toLowerCase(ch);
            }
            else{
                ch=Character.toUpperCase(ch);
            }
            res+=ch;
        }
        return res;
    }
}
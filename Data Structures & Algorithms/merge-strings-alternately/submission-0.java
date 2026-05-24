class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1=0,s2=0,e1=word1.length()-1,e2=word2.length()-1;
        StringBuilder sb=new StringBuilder();
        while(s1<=e1 && s2<=e2){
            sb.append(word1.charAt(s1++));
            sb.append(word2.charAt(s2++));
        }
        while(s2<=e2){
            sb.append(word2.charAt(s2++));
        }
        while(s1<=e1){
            sb.append(word1.charAt(s1++));
        }
        return sb.toString();
    }
}
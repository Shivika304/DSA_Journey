class Solution {
    public void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j){
            char h=s[i];
            s[i]=s[j];
            s[j]=h;
            i++;
            j--;
        }
        System.out.println(s);
    }
}
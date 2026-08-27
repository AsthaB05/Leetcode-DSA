class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=2; i<s.length(); i++){
            char a=s.charAt(i-2);
            char b=s.charAt(i-1);
            char c=s.charAt(i);
            if(a!=b && b!=c && a!=c){
                count++;
            }
        }
        return count;
    }
}
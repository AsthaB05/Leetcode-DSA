class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rf=new int[26];
        int[] mf=new int[26];

        for(int i=0; i<ransomNote.length(); i++){
            rf[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0; i<magazine.length(); i++){
            mf[magazine.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(rf[i]>mf[i]){
                return false;
            }
        }
        return true;
    }
}
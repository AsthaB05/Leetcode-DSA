class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr=new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            arr[t.charAt(i)-'a']--;
        }
        
        for(int i=0; i<26; i++){
            if(arr[i]==-1){
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        int len=0;
        int max=0;
        int[] freq=new int[26];
        int low=0;
        int high=0;
        while(high<s.length()){
            freq[s.charAt(high)-'A']++;
            max=Math.max(max,freq[s.charAt(high)-'A']);
            while(((high-low+1)-max)>k){
                freq[s.charAt(low)-'A']--;
                for(int i=0; i<26; i++){
                    max=Math.max(max,freq[i]);
                }
                low++;
            }
            len=Math.max(len,high-low+1);
            high++;
        }
        
        return len;
    }
}
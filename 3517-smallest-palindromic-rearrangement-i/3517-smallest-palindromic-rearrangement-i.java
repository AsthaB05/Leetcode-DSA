class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int[] freq=new int[26];
        for(int i=0; i<s.length()/2; i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]>0){
                while(freq[i]!=0){
                    sb.append((char)(i+'a'));
                    freq[i]--;
                }
            }
        }
        StringBuilder rev=new StringBuilder(sb);
        rev.reverse();
        if(s.length()%2==0){
            sb.append(rev);
        }else{
            char mid=s.charAt(s.length()/2);
            sb.append(mid);
            sb.append(rev);
        }
        return sb.toString();

    }
    
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1fre=new int[26];
        int[] wfre=new int[26];

        int k=s1.length();
        if(s2.length()<k){
            return false;
        }
        for(int i=0; i<k; i++){
            s1fre[s1.charAt(i)-'a']++;
            wfre[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1fre,wfre)){
            return true;
        }

        for(int i=k; i<s2.length(); i++){
            wfre[s2.charAt(i)-'a']++;
            wfre[s2.charAt(i-k)-'a']--;
            if(Arrays.equals(s1fre,wfre)){
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8){
            return word.length();
        }
        int[] freq=new int[26];
        for(int i=0; i<word.length(); i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int res=0;
        for(int i=25; i>=0; i--){
            if(freq[i]==0){
                break;
            }
            if(i>=18){
                res+=freq[i];
            }else if(i>=10){
                res+=freq[i]*2;
            }else if(i>=2){
                res+=freq[i]*3;
            }else{
                res+=freq[i]*4;
            }
        }
        return res;
    }
}
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefix=new int[words.length];
        for(int i=0; i<words.length; i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))){
                prefix[i]=1;
            }
        }
        for(int i=1; i<prefix.length; i++){
            prefix[i]+=prefix[i-1];
        }
        int[] res=new int[queries.length];
        for(int i=0; i<queries.length; i++){
            res[i]=prefix[queries[i][1]];
            if(queries[i][0]>0){
                res[i]-=prefix[queries[i][0]-1];
            }
        }
        return res;
    }
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}
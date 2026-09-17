class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        int[] vowel=new int[5];
        String sub="00000";
        int res=0;
        map.put("00000",-1);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                vowel[0]=(vowel[0]+1)%2;
            }else if(s.charAt(i)=='e'){
                vowel[1]=(vowel[1]+1)%2;
            }else if(s.charAt(i)=='i'){
                vowel[2]=(vowel[2]+1)%2;
            }else if(s.charAt(i)=='o'){
                vowel[3]=(vowel[3]+1)%2;
            }else if(s.charAt(i)=='u'){
                vowel[4]=(vowel[4]+1)%2;
            }
            sub="";
            for(int j=0; j<5; j++){
                sub+=vowel[j];
            }
            if(map.containsKey(sub)){
                res=Math.max(res,(i-map.get(sub)));
            }else{
                map.put(sub,i);
            }
        }
        return res;
    }
}
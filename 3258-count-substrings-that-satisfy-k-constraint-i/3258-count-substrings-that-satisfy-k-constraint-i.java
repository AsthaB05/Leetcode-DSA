class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int res=0;
        for(int i=0; i<s.length(); i++){
            int count1=0;
            int count0=0;
            for (int j=i; j<s.length(); j++){
                if(s.charAt(j)=='1'){
                    count1++;
                }
                if(s.charAt(j)=='0'){
                    count0++;
                }
                if(count1<=k || count0<=k){
                    res++;
                }else{
                    break;
                }
            }
        }
        return res;
    }
}
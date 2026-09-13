class Solution {
    public long minimumSteps(String s) {
        long swap=0;
        
        int idx=0;
        while(idx<s.length()){
            if(s.charAt(idx)=='0'){
                idx++;
            }else{
                break;
            }
        }
        long ones=0;
        for(int i=idx; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                ones++;
            }else{
                swap+=ones;
            }
        }
        return swap;
    }
}
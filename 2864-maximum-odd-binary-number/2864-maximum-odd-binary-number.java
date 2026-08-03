class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb=new StringBuilder();
        int zero=0;
        int one=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                zero++;
            }else{
                one++;
            }
        }
        while(one>1){
            sb.append('1');
            one--;
        }
        while(zero>0){
            sb.append('0');
            zero--;
        }
        if(one>0){
            sb.append('1');
        }
        return sb.toString();

    }
}
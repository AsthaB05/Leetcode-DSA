class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();
        int s=sum;
        while(num>0){
            for(int i=9; i>=0; i--){
                if(s-i>=0){
                    sb.append(i);
                    s-=i;
                    break;
                }
            }
            num--;
        }
        int count=0;
        for(int i=0; i<sb.length(); i++){
            count+=sb.charAt(i)-'0';
        }
        if(count==sum){
            return sb.toString();
        }
        return "";
    }
}
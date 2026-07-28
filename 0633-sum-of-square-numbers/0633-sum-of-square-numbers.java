class Solution {
    public boolean judgeSquareSum(int c) {
        int num=(int)Math.sqrt(c);
        int i=0;
        int j=num;
        while(i<=j){
            long calc=(long)(i*i)+(long)(j*j);
            if(calc==c){
                return true;
            }else if(calc<c){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
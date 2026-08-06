class Solution {
    public int[] evenOddBit(int n) {
        int[] num=new int[2];
        int odd=0;
        int even=0;
        for(int i=0; i<=10; i++){
            int bit=(n>>i) & 1;
            if(i%2==0 && bit==1){
                even++;
            }else if(i%2!=0 && bit==1){
                odd++;
            }
        }
        num[0]=even;
        num[1]=odd;
        return num;
    }
}
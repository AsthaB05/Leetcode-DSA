class Solution {
    public int countPrimeSetBits(int left, int right) {
        int countP=0;
        for(int i=left; i<=right; i++){
            int count=0;
            int n=i;
            while(n>0){
                int bit=n & 1;
                if(bit==1){
                    count++;
                }
                n>>=1;
            }
            if(isPrime(count)){
                countP++;
            }
        }
        return countP;
    }
    public boolean isPrime(int count){
        if(count==1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(count); i++){
            if(count%i==0){
                return false;
            }
        }
        return true;
    }
}
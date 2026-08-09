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
    public boolean isPrime(int c){
        if(c==2 || c==3 || c==5 || c==7 || c==11 || c==13 || c==17 || c==19){
            return true;
        }
        
        return false;
    }
}
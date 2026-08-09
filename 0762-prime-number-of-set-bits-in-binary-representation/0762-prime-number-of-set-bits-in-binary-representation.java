class Solution {
    public int countPrimeSetBits(int left, int right) {
        int countP=0;
        for(int i=left; i<=right; i++){
            int c=Integer.bitCount(i);
            if(c==2 || c==3 || c==5 || c==7 || c==11 || c==13 || c==17 || c==19){
                countP++;
            }
        }
        return countP;
    }
}
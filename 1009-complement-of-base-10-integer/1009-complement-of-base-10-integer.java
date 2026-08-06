class Solution {
    public int bitwiseComplement(int n) {
        int res=0;
        int pos=0;
        if(n==0){
            return 1;
        }
        while(n>0){
            int bit=n & 1;
            if(bit==0){
                res |= (1<<pos);
            }
            pos++;
            n>>=1;
        }
        return res;
    }
}
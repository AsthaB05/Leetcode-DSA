class Solution {
    public boolean hasAlternatingBits(int n) {
        int current=0;
        if(n % 2 == 0){
            current=1;
        }
        int pos=0;
        while(n>0){
            int bit=n & 1;
            if(bit==current){
                return false;
            }else{
                current=bit;
            }
            pos++;
            n>>=1;
        }
        return true;
    }
}
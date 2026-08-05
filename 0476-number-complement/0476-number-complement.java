class Solution {
    public int findComplement(int num) {
        int res=0;
        int pos=0;
        while(num>0){
            int bit=num & 1;
            if(bit==0){
                res |= (1<<pos);
            }
            num= num >>1;
            pos++;
        }
        return res;
    }
}
class Solution {
    public int[] countBits(int n) {
        int[] bits=new int[n+1];
        for(int i=0; i<=n; i++){
            int count=0;
            int mask=i;
            while(mask>0){
                int bit=mask & 1;
                if(bit==1){
                    count++;
                }
                mask=mask>>1;
            }
            bits[i]=count;
        }
        return bits;
    }
}
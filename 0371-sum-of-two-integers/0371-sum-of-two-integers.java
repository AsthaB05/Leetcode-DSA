class Solution {
    public int getSum(int a, int b) {
        int carry=0;
        int res=0;
        for(int i=0; i<32; i++){
            int lasta=(a>>i)&1;
            int lastb=(b>>i)&1;
            int ans=lasta^lastb^carry;
            res |= (ans<<i);
            carry=(lasta & lastb) | (lasta & carry) | (lastb & carry);
        }
        return res;
    }
}
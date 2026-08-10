class Solution {
    public int binaryGap(int n) {
        int res=0;
        int i=-1;
        int j=0;
        while(n>0){
            if((n & 1)==1){
                if(i!=-1){
                    res=Math.max(res, j-i);
                }
                i=j;
            }
            j++;
            n>>=1;
        }
        return res;

    }
}
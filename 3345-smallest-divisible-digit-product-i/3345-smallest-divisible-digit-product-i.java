class Solution {
    public int smallestNumber(int n, int t) {
        int num=n;
        if(t==1){
            return n;
        }
        while(true){
            if((findPro(n)%t)==0){
                return n;
            }else{
                n++;
            }
        }
        
    }
    public int findPro(int n){
        int pro=1;
        while(n>0){
            int ld=n%10;
            pro*=ld;
            n/=10;
        }
        return pro;
    }
}
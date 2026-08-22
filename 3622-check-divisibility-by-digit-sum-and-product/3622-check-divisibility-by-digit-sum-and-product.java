class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int pro=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        if(num%(sum+pro)==0){
            return true;
        }
        return false;
    }
}
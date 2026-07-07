class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int sum =0;
        while(n!=0){
            if(n%10==0){
                n=n/10;
            }else{
                int ld=n%10;
                sum=sum+ld;
                x=x*10+ld;
                n=n/10;
            }
        }
        long num=0;
        while(x!=0){
            int rem=x%10;
            num=num*10+rem;
            x=x/10;
        }
        return num*sum;
        
    }
}
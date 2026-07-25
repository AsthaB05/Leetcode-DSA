class Solution {
    public int maxProduct(int n) {
        int largest=-1;
        int second=-1;
        while(n!=0){
            int rem=n%10;
            if(rem>largest){
                second=largest;
                largest=rem;
            }else if(rem>=second){
                second=rem;
            }
            n/=10;
        }
        return largest*second;
    }
}
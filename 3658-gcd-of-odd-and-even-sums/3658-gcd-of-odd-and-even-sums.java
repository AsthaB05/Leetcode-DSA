class Solution {
    public int gcdOfOddEvenSums(int n) {
        int start=1;
        int end=n*2;
        int evenSum=0;
        int oddSum=0;
        while(start<=end){
            if(start%2==0){
                evenSum+=start;
            }else{
                oddSum+=start;
            }
            start++;
        }
        return (int)Math.sqrt(oddSum);
    }
}
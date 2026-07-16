class Solution {
    public long gcdSum(int[] nums) {
        int max=0;
        int[] preGcd=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
            int a=max;
            int gcd=findGcd(a,nums[i]);
            preGcd[i]=gcd;
            
        }
        Arrays.sort(preGcd);
        int start=0;
        int end=preGcd.length-1;
        long sum=0;
        while(start<end){
            int gcd=findGcd(preGcd[start],preGcd[end]);
            sum+=gcd;
            start++;
            end--;
        }
        return sum;
    }
    private int findGcd(int a, int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}

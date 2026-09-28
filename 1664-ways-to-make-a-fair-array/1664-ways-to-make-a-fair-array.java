class Solution {
    public int waysToMakeFair(int[] nums){
        int evenSum=0;
        int oddSum=0;
        int[] odd=new int[nums.length];
        int[] even=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                evenSum+=nums[i];
            }else{
                oddSum+=nums[i];
            }
            odd[i]=oddSum;
            even[i]=evenSum;
        }
        int res=0;
        for(int i=0; i<nums.length; i++){
            if(i==0){
                evenSum=odd[nums.length-1];
                oddSum=even[nums.length-1]-even[0];
            }
            else{
                evenSum=even[i-1]+odd[nums.length-1]-odd[i];
                oddSum=odd[i-1]+even[nums.length-1]-even[i];
            }
            if(evenSum==oddSum){
                res++;
            }
        }
        return res;
    }
}
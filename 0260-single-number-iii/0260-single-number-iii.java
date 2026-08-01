class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2){
            return nums;
        }
        int xor=0;
        for(int num: nums){
            xor^=num;
        }
        int setbit=xor & (-xor);
        int xor1=0;
        int xor2=0;
        for(int num: nums){
            if((num & setbit)!=0){
                xor1^=num;
            }else{
                xor2^=num;
            }
        }
        int[] arr=new int[2];
        arr[0]=xor1;
        arr[1]=xor2;
        return arr;

    }
}
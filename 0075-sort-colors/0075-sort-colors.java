class Solution {
    public void sortColors(int[] nums) {
        int[] count=new int[3];        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count[0]++;
            }else if(nums[i]==1){
                count[1]++;
            }else{
                count[2]++;
            }
        }
        int end=count[0];
        int idx=0;
        while(idx<nums.length){
            if(idx<count[0]){
                nums[idx]=0;
            }else if(idx<(count[0]+count[1])){
                nums[idx]=1;
            }else{
                nums[idx]=2;
            }
            idx++;
        }
    }
}
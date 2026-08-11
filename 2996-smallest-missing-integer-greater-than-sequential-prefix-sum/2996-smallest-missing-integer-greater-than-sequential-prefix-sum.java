class Solution {
    public int missingInteger(int[] nums) {
        int j=1;
        int sum=nums[0];
        while(j<nums.length){
            if(nums[j]==(nums[j-1]+1)){
                sum+=nums[j];
                j++;
            }else{
                break;
            }
        }
        boolean[] freq=new boolean[52];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]=true;
        }
        if(sum>50){
            return sum;
        }
        for(int i=sum; i<52; i++){
            if(freq[i]==false){
                return i;
            }
        }
        return 0;
    }
}
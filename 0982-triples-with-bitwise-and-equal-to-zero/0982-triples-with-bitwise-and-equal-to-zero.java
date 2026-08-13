class Solution {
    public int countTriplets(int[] nums) {
        int[] freq=new int[65536];
        
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                int and=nums[i] & nums[j];
                freq[and]++;
            }
        }
        int count=0;
        for(int k=0; k<nums.length; k++){
            for(int i=0; i<freq.length; i++){
                if((i & nums[k])==0){
                    count+=freq[i];
                }
            }
        }
        return count;
    }
}
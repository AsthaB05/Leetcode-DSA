class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subArrays(nums, k)-subArrays(nums,k-1);
        
    }
    private int subArrays(int[] nums, int n){
        int count=0;
        int low=0;
        int high=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        while(high<nums.length){
            map.put(nums[high], map.getOrDefault(nums[high],0)+1);
            
            while(map.size()>n){
                map.put(nums[low],map.get(nums[low])-1);
                if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
                low++;

            }
            count+=high-low+1;
            high++;
            
        }
        return count;
    }
}
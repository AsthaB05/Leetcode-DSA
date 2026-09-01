class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int low=0;
        int high=0;
        int sum=0;
        int max=0;
        while(high<nums.length){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            while(map.get(nums[high])>1){
                sum-=nums[low];
                map.put(nums[low],map.get(nums[low])-1);
                if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
                low++;
            }
            sum+=nums[high];
            max=Math.max(max,sum);
            high++;
        }
        return max;
    }
}
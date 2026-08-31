class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        long res=0;
        int same=0;
        int low=0; 
        int high=0;
        while(low<nums.length){
            while(same<k && high<nums.length){
                same+=map.getOrDefault(nums[high],0);
                map.put(nums[high],map.getOrDefault(nums[high],0)+1);
                high++;
            }
            if(same>=k){
                res+=nums.length-high+1;
            }
            map.put(nums[low],map.get(nums[low])-1);
            if(nums[low]>0){
                same-=map.get(nums[low]);
            }
            low++;
        }
        return res;
    }
}
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int k=set.size();
        int count=0;
        for(int low=0; low<=nums.length-k; low++){
            HashMap<Integer, Integer> map=new HashMap<>();
            int high=low;
            while(high<nums.length){
                map.put(nums[high],map.getOrDefault(nums[high],0)+1);
                
                if(map.size()==k){
                    count++;
                }
                high++;

            }
        }
        return count;
    }
}
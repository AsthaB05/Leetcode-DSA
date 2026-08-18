class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(k==nums.length){
            int max=-1;
            for(Integer key: map.keySet()){
                max=Math.max(key,max);
            }
            return max;
        }
        if(k==1){
            int max=-1;
            for(Integer key: map.keySet()){
                if(map.get(key)==1){
                    max=Math.max(max,key);
                }
            }
            return max;
        }
        int first=map.get(nums[0]);
        int last=map.get(nums[nums.length-1]);
        if(first==1 && last==1){
            return Math.max(nums[0],nums[nums.length-1]);
        }else if(first==1){
            return nums[0];
        }else if(last==1){
            return nums[nums.length-1];
        }
        return -1;
    }
}
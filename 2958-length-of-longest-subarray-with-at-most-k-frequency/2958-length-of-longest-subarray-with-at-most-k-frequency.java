class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        if(nums.length==k){
            return k;
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<nums.length){
            if(!map.containsKey(nums[j])){
                map.put(nums[j],1);
                j++;
            }else{
                if(map.get(nums[j])<k){
                    map.put(nums[j],map.get(nums[j])+1);
                    j++;
                }else{
                    map.put(nums[i],map.get(nums[i])-1);
                    i++;
                }
            }
            max=Math.max(max,j-i);
        }
        return max;
    }
}
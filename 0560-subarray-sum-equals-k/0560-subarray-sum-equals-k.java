class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        int currSum=0;
        int res=0;
        for(int i=0; i<nums.length; i++){
            currSum+=nums[i];
            if(map.containsKey(currSum-k)){
                res+=map.get(currSum-k);
            }
            if(!map.containsKey(currSum)){
                map.put(currSum,1);
            }else{
                map.put(currSum,map.get(currSum)+1);
            }
        }
        return res;
    }
}
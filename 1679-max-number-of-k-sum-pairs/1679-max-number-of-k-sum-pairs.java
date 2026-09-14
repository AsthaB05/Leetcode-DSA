class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int i=0; i<nums.length; i++){
            int c=k-nums[i];
            if(map.getOrDefault(c,0)>0){
                res++;
                map.put(c,map.get(c)-1);
            }else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }       
        return res;
    }
}
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int small=100;
        int large=0;
        for(int i=0; i<nums.length; i++){
            small=Math.min(small, nums[i]);
            large=Math.max(large, nums[i]);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=small; i<large; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;

    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int longest=0;
        for(int num: set){
            if(!set.contains(num-1)){
                int length=1;
                int current=num;
                while(set.contains(current+1)){
                    length++;
                    current++;
                }
                longest=Math.max(longest,length);             
            }
        }
        return longest;       
    }
}
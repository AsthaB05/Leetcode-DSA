class Solution {
    public int minMoves(int[] nums) {
        int moves=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            moves+=max-nums[i];
        }
        return moves;
    }
}
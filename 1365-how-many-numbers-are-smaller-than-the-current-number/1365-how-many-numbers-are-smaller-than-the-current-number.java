class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted=Arrays.copyOf(nums,nums.length);
        int[] result=new int[nums.length];
        Arrays.sort(sorted);

        for(int i=0; i<nums.length; i++){
            int left=0, right=sorted.length;
            int count=0;
            while(left<=right){
                int mid=(left+right)/2;
                if(nums[i]>sorted[mid]){
                    count=mid+1;
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            result[i]=count;

        }
    return result;
    }
}
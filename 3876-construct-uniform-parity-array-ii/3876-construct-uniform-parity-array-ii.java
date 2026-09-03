class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0;
        int odd=0;
        int smallOdd=Integer.MAX_VALUE;
        int smallEven=Integer.MAX_VALUE;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]%2==0){
                even++;
                smallEven=Math.min(smallEven,nums1[i]);
            }else{
                smallOdd=Math.min(smallOdd,nums1[i]);
            }
        }
        if(even==nums1.length || even==0){
            return true;
        }       
        if(smallOdd<smallEven){
            return true;
        }else{
            return false;
        }
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int idx=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                temp[idx]=nums1[i];
                i++;

            }else{
                temp[idx]=nums2[j];
                j++;
            }
            idx++;
        }
        if(i<nums1.length){
            while(i<nums1.length){
                temp[idx]=nums1[i];
                i++;
                idx++;
            }
        }
        if(j<nums2.length){
            while(j<nums2.length){
                temp[idx]=nums2[j];
                j++;
                idx++;
            }
        }
        double med=0D;
        if(temp.length%2==0){
            med=(double)(temp[temp.length/2]+temp[(temp.length/2)-1])/2;
        }else{
            med=temp[temp.length/2];
        }
        return med;
    }
}
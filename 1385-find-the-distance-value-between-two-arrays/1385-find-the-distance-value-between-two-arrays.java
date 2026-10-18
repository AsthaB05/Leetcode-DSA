class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res=0;
        for(int i=0; i<arr1.length; i++){
            if(isTrue(arr1[i], arr2, d)){
                res++;
            }
        }
        return res;
    }
    public boolean isTrue(int x, int[] arr, int d){
        for(int i=0; i<arr.length; i++){
            if(Math.abs(x-arr[i])<=d){
                return false;
            }
        }
        return true;
    }
}
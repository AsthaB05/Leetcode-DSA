class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int low=0;
        int high=0;
        int sum=0;
        while(high<arr.length){
            sum+=arr[high];
            if((high-low+1)<k){
                high++;
            }else{
                if((sum/k)>=threshold){
                    count++;
                }
                sum-=arr[low];
                low++;
                high++;
            }
        }
        return count;
    }
}
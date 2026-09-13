class Solution {
    public int[] getStrongest(int[] arr, int k) {
        // if(arr.length<=1){
        //     return arr;
        // }
        Arrays.sort(arr);
        int m=arr[(arr.length-1)/2];
        int left=0;
        int right=arr.length-1;
        int[] res=new int[k];
        int idx=0;
        while(idx<k){
            if(Math.abs(arr[left]-m)>Math.abs(arr[right]-m)){
                res[idx]=arr[left];
                left++;
            }else if(Math.abs(arr[left]-m)<Math.abs(arr[right]-m)){
                res[idx]=arr[right];
                right--;
            }else{
                if(arr[right]>arr[left]){
                    res[idx]=arr[right];
                    right--;
                }else{
                    res[idx]=arr[left];
                    left++;
                }
            }
            idx++;
        }
        return res;
    }
}
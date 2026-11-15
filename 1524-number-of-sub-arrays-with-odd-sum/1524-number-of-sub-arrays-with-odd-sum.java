class Solution {
    public int numOfSubarrays(int[] arr) {
        for(int i=1; i<arr.length; i++){
            arr[i]+=arr[i-1];
        }
        int even=0;
        int odd=0;
        int res=0;
        int mod = 1000000007;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                res=(res+odd)%mod;
                even++;
            }else{
                odd++;
                res=(res+1+even)%mod;
                
            }
        }
        return res;
    }
}
class Solution {
    public int triangleNumber(int[] nums) {
        int res=0;
        if(nums.length<3){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]==0){
                continue;
            }
            for(int j=i+1; j<nums.length-1; j++){
                if(nums[j]==0){
                    continue;
                }
                int sum=nums[i]+nums[j];
                int start=j+1;
                int end=nums.length-1;
                int k=-1;
                while(start<=end){
                    int mid=(start+end)/2;
                    if(nums[mid]<sum){
                        k=mid;
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }

                }
                if(k!=-1){
                    res+=(k-j);
                }
                
            }
        }
        return res;
    }
}
class Solution {
    public int maximumStrongPairXor(int[] nums) {
        boolean[] istrue=new boolean[101];
        for(int i=0; i<nums.length; i++){
            istrue[nums[i]]=true;
        }
        int xor=0;
        for(int i=1; i<istrue.length; i++){
            if(istrue[i]){
                for(int j=i; j<istrue.length; j++){
                    if(istrue[j]){
                        if((j-i)<=i){
                            xor=Math.max(xor,i^j);
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        return xor;
    }
}
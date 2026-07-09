class Solution {
    public void rotate(int[] nums, int k) {

        k=k%nums.length;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int y=0;
        int z=k-1;
        while(y<z){
            int temp=nums[y];
            nums[y]=nums[z];
            nums[z]=temp;
            y++;
            z--;
        }
        int s=nums.length-1;
        while(k<s){
            int temp=nums[k];
            nums[k]=nums[s];
            nums[s]=temp;
            k++;
            s--;
        }
    }
}
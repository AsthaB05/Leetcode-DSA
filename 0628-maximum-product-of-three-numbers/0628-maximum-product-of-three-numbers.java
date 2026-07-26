class Solution {
    public int maximumProduct(int[] nums) {
        int[] freq=new int[2002];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]+1000]++;
        }
        int i=freq.length-1;
        int[] largest=new int[3];
        int j=0;
        while(j<3 && i>=0){
            if(freq[i]>0){
                while(freq[i]>0 && j<3){
                    largest[j++]=(i-1000);
                    freq[i]--;
                }
            }
            i--;
        }
        int pro=largest[0]*largest[1]*largest[2];
        freq=new int[2002];
        for(int x=0; x<nums.length; x++){
            freq[nums[x]+1000]++;
        }
        int k=0;
        int[] smallest=new int[2];
        int l=0;
        while(l<2 && k<freq.length){
            if(freq[k]>0){
                while(freq[k]>0 && l<2){
                    smallest[l++]=(k-1000);
                    freq[k]--;
                }
            }
            k++;
        }
        int pro2=smallest[0]*smallest[1]*largest[0];
        return Math.max(pro,pro2);

    }
}
class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        for(int i=0; i<code.length; i++){
            int sum=0;
            if(k>0){
                int temp=k;
                int j=i+1;
                while(temp>0){
                    sum+=code[j%code.length];
                    temp--;
                    j++;
                }
                res[i]=sum;
            }else if(k<0){
                int temp=Math.abs(k);
                int j=(i-1)+code.length;
                while(temp>0){
                    sum+=code[Math.abs(j%code.length)];
                    temp--;
                    j--;
                }
                res[i]=sum;
            }else{
                res[i]=0;
            }
            
        }
        return res;
    }
}
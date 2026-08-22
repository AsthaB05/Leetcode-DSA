class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        if(k==0){
            return res;
        }
        int sum=0;
        int start=0;
        if(k>0){
            int end=0;
            while(start<code.length){
                sum+=code[(end+1)%code.length];
                if((end-start+1)<k){
                    end++;
                }else{
                    res[start]=sum;
                    sum-=code[(start+1)%code.length];
                    start++;
                    end++;
                }
                
            }   
        }else{
            int end=code.length+k;
            while(start<code.length){
                sum+=code[end%code.length];
                if((end-(code.length+k)+1)<-k){
                    end++;
                }else{
                    res[start]=sum;
                    sum-=code[(code.length+k+start)%code.length];
                    start++;
                    end++;
                }
            }
        }
        return res;
    }
}
class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int[] prefix=new int[n+1];
        for(int i=1; i<=n; i++){
            if(customers.charAt(i-1)=='N'){
                prefix[i]=prefix[i-1]+1;
            }else{
                prefix[i]=prefix[i-1];
            }
        }

        int[] suffix=new int[n+1];
        for(int i=n-1; i>=0; i--){
            if(customers.charAt(i)=='Y'){
                suffix[i]=suffix[i+1]+1;
            }else{
                suffix[i]=suffix[i+1];
            }
            
        }
        int penalty=Integer.MAX_VALUE;
        int idx=Integer.MAX_VALUE;
        for(int i=0; i<=n; i++){
            int curr=prefix[i]+suffix[i];
            if(penalty>curr){
                penalty=prefix[i]+suffix[i];
                idx=i;
            }
            
        }
        return idx;   
    }
}
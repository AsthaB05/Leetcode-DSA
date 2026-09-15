class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int g=0;
        int p=0;
        int m=0;
        int sum=0;
        for(int i=0; i<garbage.length; i++){
            for(int j=0; j<garbage[i].length(); j++){
                if(garbage[i].charAt(j)=='G'){
                    g=i;
                }else if(garbage[i].charAt(j)=='P'){
                    p=i;
                }else{
                    m=i;
                }
                sum++;
            }

        }
        
        for(int i=1; i<travel.length; i++){
            travel[i]+=travel[i-1];
        }
        if(g>0){
            sum+=travel[g-1];
        }
        if(p>0){
            sum+=travel[p-1];
        }
        if(m>0){
            sum+=travel[m-1];
        }
        return sum;
    }
}
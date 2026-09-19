class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {   
        for(int i=0; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                matrix[i][j]=matrix[i][j-1]+matrix[i][j];
            }
        }
        int res=0;
        for(int sp=0; sp<matrix[0].length; sp++){
            for(int j=sp; j<matrix[0].length; j++){
                HashMap<Integer, Integer> map=new HashMap<>();
                map.put(0,1);
                int currSum=0;
                for(int i=0; i<matrix.length; i++){
                    if(sp==0){
                        currSum+=matrix[i][j];
                    }else{
                        currSum+=matrix[i][j]-matrix[i][sp-1];
                    }
                    
                    if(map.containsKey(currSum-target)){
                        res+=map.get(currSum-target);
                    }
                    if(!map.containsKey(currSum)){
                        map.put(currSum,1);
                    }else{
                        map.put(currSum,map.get(currSum)+1);
                    }
                }
            }
        }
        
        return res;
    }
}
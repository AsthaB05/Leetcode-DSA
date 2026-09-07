class Solution {
    public int[] minOperations(String boxes) {
        int[] res=new int[boxes.length()];
        for(int i=0; i<boxes.length(); i++){
            if(boxes.charAt(i)=='1'){
                for(int j=0; j<boxes.length(); j++){
                    res[j]+=Math.abs(j-i);
                }
            }
        }
        return res;
    }
}
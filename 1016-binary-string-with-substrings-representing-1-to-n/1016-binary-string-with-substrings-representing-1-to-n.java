class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1; i<=n; i++){
            String sub=Integer.toBinaryString(i);
            if(!s.contains(sub)){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int equalSubstring(String s, String t, int maxCost){
        int res=0;
        int low=0;
        int high=0;
        int calc=0;
        while(high<s.length()){
            calc+=Math.abs(t.charAt(high)-s.charAt(high));
            while(calc>maxCost){
                calc-=Math.abs(t.charAt(low)-s.charAt(low));
                low++;
            }
            
            res=Math.max(res,high-low+1);
            high++;  
        }
        return res;
    }
}
class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        String vwl="aeiou";
        int count=0;
        for(int i=0; i<k; i++){
            if(vwl.contains(String.valueOf(s.charAt(i)))){
                count++;
            }
        }
        max=count;
        
        for(int i=k; i<s.length(); i++){
            if(vwl.contains(String.valueOf(s.charAt(i-k)))){
                count--;
            }
            if(vwl.contains(String.valueOf(s.charAt(i)))){
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=100;
        int count=0;
        for(int i=0; i<k; i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        min=Math.min(min,count);
        for(int i=k; i<blocks.length(); i++){
            if(blocks.charAt(i-k)=='W'){
                count--;
            }
            if(blocks.charAt(i)=='W'){
                count++;
            }
            min=Math.min(min,count);
        }
        return min;

    }
}
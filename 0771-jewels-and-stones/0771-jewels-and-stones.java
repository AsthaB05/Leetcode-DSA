class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] freq=new int[125];
        for(int i=0; i<stones.length(); i++){
            freq[stones.charAt(i)]++;
        }
        int count=0;
        for(int i=0; i<jewels.length(); i++){
            count+=freq[jewels.charAt(i)];
        }
        return count;
    }
}
class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0; i<cards.length; i++){
            if(!map.containsKey(cards[i])){
                map.put(cards[i],i);
            }else{
                min=Math.min(min,i+1-map.get(cards[i]));
                map.put(cards[i],i);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }else{
            return min;
        }
    }
}
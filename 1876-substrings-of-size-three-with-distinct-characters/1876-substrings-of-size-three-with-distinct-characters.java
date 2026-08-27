class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        HashMap<Character, Integer> map=new HashMap<>();
        int low=0;
        int high=0;
        int count=0;
        while(high<s.length()){
            if(!map.containsKey(s.charAt(high))){
                map.put(s.charAt(high),1);
            }else{
                map.put(s.charAt(high),map.get(s.charAt(high))+1);
            }
            if((high-low+1)<3){
                high++;
            }else{
                if(map.size()==3){
                    count++;
                }
                if(map.get(s.charAt(low))>1){
                    map.put(s.charAt(low),map.get(s.charAt(low))-1);
                }else{
                    map.remove(s.charAt(low));
                }
                high++;
                low++;
            }
        }
        return count;
    }
}
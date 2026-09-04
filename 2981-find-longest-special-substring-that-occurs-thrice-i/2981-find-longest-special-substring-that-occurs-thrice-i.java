class Solution {
    public int maximumLength(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j)==ch){
                    map.put(s.substring(i,j+1),map.getOrDefault(s.substring(i, j+1),0)+1);
                }else{
                    break;
                }
            }
        }
        int max=-1;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>=3){
                max=Math.max(max,entry.getKey().length());
            }
        }
        return max;
    }
}
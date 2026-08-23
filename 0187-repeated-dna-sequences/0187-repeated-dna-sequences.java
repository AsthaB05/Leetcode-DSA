class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        if(s.length()<=10){
            return list;
        }
        for(int i=0; i<=s.length()-10; i++){
            String sb=s.substring(i,i+10);
            map.put(sb,map.getOrDefault(sb,0)+1);
            if(map.get(sb)==2){
                list.add(sb);
            }
        }
        return list;
    }
}
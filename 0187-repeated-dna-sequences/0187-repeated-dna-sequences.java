class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set=new HashSet<>();
        HashSet<String> repeat=new HashSet<>();
        List<String> list=new ArrayList<>();
        if(s.length()<10){
            return list;
        }
        int k=10;
        for(int i=k; i<=s.length(); i++){
            String sub=s.substring(i-k,i);
            if(!set.contains(sub)){
                set.add(sub);
            }else if(!repeat.contains(sub)){
                repeat.add(sub);
            }
        }
        for(String res:repeat){
            list.add(res);
        }
    
        return list;
        

    }
}
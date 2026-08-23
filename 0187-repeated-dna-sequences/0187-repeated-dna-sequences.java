class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> map=new HashSet<>();
        HashSet<String> set=new HashSet<>();
        if(s.length()<=10){
            return new ArrayList<>();
        }
        for(int i=0; i<=s.length()-10; i++){
            String sb=s.substring(i,i+10);
            if(!map.contains(sb)){
                map.add(sb);
            }else{
                set.add(sb);
            }
        }
        return new ArrayList<>(set);
    }
}
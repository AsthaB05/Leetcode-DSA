class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String k=new String(ch);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(strs[i]);
        }
        for(List<String> value: map.values()){
            list.add(value);
        }
        return list;
    }

}
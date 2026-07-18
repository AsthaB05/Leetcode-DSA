class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> win=new HashSet<>();
        HashMap<Integer, Integer> loss=new HashMap<>();

        for(int i=0; i<matches.length; i++){
            if(!win.contains(matches[i][0])){
                win.add(matches[i][0]);
            }
        }
        for(int i=0; i<matches.length; i++){
            if(!loss.containsKey(matches[i][1])){
                loss.put(matches[i][1],1);
            }else{
                loss.put(matches[i][1],loss.get(matches[i][1])+1);
            }
        }
        List<Integer> wres=new ArrayList<>();
        for(Integer i: win){
            if(!loss.containsKey(i)){
                wres.add(i);
            }
        }
        List<Integer> lres=new ArrayList<>();
        for(Integer key: loss.keySet()){
            if(loss.get(key)==1){
                lres.add(key);
            }
        }
        Collections.sort(wres);
        Collections.sort(lres);
        List<List<Integer>> res=new ArrayList<>();
        res.add(wres);
        res.add(lres);
        return res;
        

    }
}
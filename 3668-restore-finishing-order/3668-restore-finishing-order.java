class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res=new int[friends.length];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<friends.length; i++){
            set.add(friends[i]);
        }
        int idx=0;
        for(int i=0; i<order.length; i++){
            if(set.contains(order[i])){
                res[idx]=order[i];
                idx++;
            }
        }
        return res;
    }
}
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<banned.length; i++){
            if(banned[i]<=n){
                set.add(banned[i]);
            }
        }
        long sum=0;
        int count=0;
        for(int i=1; i<=n; i++){
            
            if(!set.contains(i) && (sum+i)<=maxSum){
                sum+=i;
                count++;
            }
        }
        return count;
    }
}
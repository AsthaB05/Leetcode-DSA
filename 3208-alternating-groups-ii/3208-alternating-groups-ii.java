class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int res=0;
        int low=0;
        int high=1;
        while(low<colors.length){
            while((high-low)<k && low<n){
                if(colors[(high-1)%n]!=colors[high%n]){
                    high++;
                }else{
                    low=high;
                    high++;
                }
            }
            if((high-low)==k){
                res++;
            }
            low++;
        }
        return res;
    }
}
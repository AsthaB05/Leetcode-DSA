class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res=new int[spells.length];
        for(int i=0; i<spells.length; i++){
            int start=0;
            int end=potions.length-1;
            while(start<end){
                int mid=start+(end-start)/2;
                if(((long)spells[i]*potions[mid])>=success){
                    end=mid;
                }else{
                    start=mid+1;
                }
            }
            if(start==potions.length-1 && end==potions.length-1 && ((long)spells[i]*potions[potions.length-1])<success){
                res[i]=0;
            }else{
                res[i]=potions.length-start;
            }
            
        }
        return res;
    }
}
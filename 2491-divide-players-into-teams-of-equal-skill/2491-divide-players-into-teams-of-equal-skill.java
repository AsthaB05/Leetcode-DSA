class Solution {
    public long dividePlayers(int[] skill) {
        long res=0;
        Arrays.sort(skill);
        int ini=skill[0]+skill[skill.length-1];
        int i=0;
        int j=skill.length-1;
        while(i<j){
            if((skill[i]+skill[j])==ini){
                res+=skill[i]*skill[j];
            }else{
                return -1;
            }
            i++;
            j--;
        }
        return res;
    }
}
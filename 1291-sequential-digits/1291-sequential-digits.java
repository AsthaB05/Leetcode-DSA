class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String all="123456789";
        List<Integer> list=new ArrayList<>();
        
        int ll=String.valueOf(low).length();
        int hl=String.valueOf(high).length();

        int i=0;
        
        while(i<=all.length()-ll){
            int j=ll+i;
            while(j<=all.length()){
                if(Integer.parseInt(all.substring(i,j))>=low &&
                Integer.parseInt(all.substring(i,j))<=high)
                {
                    list.add(Integer.parseInt(all.substring(i,j)));
                }
                j++;               
            }
            i++;
        }
        Collections.sort(list);
        return list;
        
    }
}
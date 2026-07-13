class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String all="123456789";
        List<Integer> list=new ArrayList<>();
        
        int ll=String.valueOf(low).length();
        int hl=String.valueOf(high).length();

        int i=ll;
        
        while(i<=hl){
            int j=0;
            while(j<=all.length()-i){
                int ss=Integer.parseInt(all.substring(j,i+j));
                if(ss>=low && ss<=high){
                    list.add(ss);
                }
                j++;               
            }
            i++;
        }
        Collections.sort(list);
        return list;
        
    }
}
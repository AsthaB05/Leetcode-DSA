class Solution {
    public String reverseWords(String s) {
        List<String> list=new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        int start=0;
        int end=list.size()-1;
        while(start<end){
            String temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
        String res=String.join(" ",list);
        return res;
        
    }
}
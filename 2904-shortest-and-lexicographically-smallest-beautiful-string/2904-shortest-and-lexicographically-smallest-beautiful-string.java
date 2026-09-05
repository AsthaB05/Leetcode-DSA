class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int len=100;
        int low=0;
        int high=0;
        int sum=0;
        List<String> list=new ArrayList<>();
        while(high<s.length()){
            if(s.charAt(high)=='1'){
                sum+=s.charAt(high)-'0';
            }
            while(low<s.length() && (sum>k || s.charAt(low)=='0')){
                sum-=s.charAt(low)-'0';
                low++;
            }
            if(sum==k){
                len=Math.min(len,high-low+1);
                list.add(s.substring(low,high+1));
            }
            high++;
        }
        if(list.isEmpty()){
            return "";
        }
        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i).length()>len){
                list.remove(i);
            }
        }
        if(list.size()==1){
            return list.get(0);
        }
        String small=list.get(0);
        for(int i=1; i<list.size();i++){
            if(list.get(i).compareTo(small)<0){
                small=list.get(i);
            }
        }
        return small;
    }
}
class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int[] start=new int[26];
        Arrays.fill(start,-1);
        int[] end=new int[26];
        boolean[] isvalid=new boolean[26];
        List<String> res=new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            int idx=s.charAt(i)-'a';
            if(start[idx]==-1){
                start[idx]=i;
            }
            end[idx]=i;
        }
        for(int c=0; c<26; c++){
            if(start[c]==-1){
                continue;
            }
            isvalid[c]=true;
            for(int i=start[c]; i<=end[c]; i++){
                if(start[s.charAt(i)-'a']<start[c]){
                    isvalid[c]=false;
                    break;
                }
                end[c]=Math.max(end[c],end[s.charAt(i)-'a']);

            }
        }
        int last=Integer.MAX_VALUE;
        for(int i=s.length()-1; i>=0; i--){
            int idx=s.charAt(i)-'a';
            if(!isvalid[idx]){
                continue;
            }
            if(i==start[idx] && end[idx]<last){
                res.add(s.substring(i,end[idx]+1));

                last=i;
            }
        }
        return res;
    }
}
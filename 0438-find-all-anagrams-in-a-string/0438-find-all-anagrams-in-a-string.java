class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int[] freqp=new int[26];
        int[] freqw=new int[26];

        int k=p.length();
        if(s.length()<k){
            return list;
        }
        for(int i=0; i<k; i++){
            freqp[p.charAt(i)-'a']++;
            freqw[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freqp,freqw)){
            list.add(0);
        }

        for(int i=k; i<s.length(); i++){
            freqw[s.charAt(i)-'a']++;
            freqw[s.charAt(i-k)-'a']--;
            if(Arrays.equals(freqw,freqp)){
                list.add(i-k+1);
            }
        }
        return list;
    }
}
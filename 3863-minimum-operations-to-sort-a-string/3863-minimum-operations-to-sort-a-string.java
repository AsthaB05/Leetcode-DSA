class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String s2=new String(arr);
        int n=s.length();      
        if(s.equals(s2) || n==1){
            return 0;
        }
        if(n==2){
            return -1;
        }
        char mn=s2.charAt(0);
        char mx=s2.charAt(n-1);

        if(s.charAt(0)==mn || s.charAt(n-1)==mx){
            return 1;
        }
        for(int i=0; i<n-1; i++){
            if(mn==s.charAt(i)){
                return 2;
            }
        }
        for(int i=1; i<n; i++){
            if(mx==s.charAt(i)){
                return 2;
            }
        }
        return 3;
    }
}
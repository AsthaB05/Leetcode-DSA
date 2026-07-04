class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<end){
            char temp;
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            System.out.print(s[end]);
            start++;
            end--;
            
        }
        for(int i=0; i<(s.length)/2; i++){
            System.out.print(s[i]);
        }
    }
}
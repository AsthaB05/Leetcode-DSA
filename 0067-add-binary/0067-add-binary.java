class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        int res=0;
        while(i>=0 || j>=0){
            int n1=0;
            int n2=0;
            if(i>=0){
                n1=a.charAt(i)-'0';
            }
            if(j>=0){
                n2=b.charAt(j)-'0';
            }
            res=(n1)^(n2)^carry;
            sb.append(res);
            carry=(n1 & n2) | (n1 & carry) | (n2 & carry);
            i--;
            j--;
        }
        if(carry==1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
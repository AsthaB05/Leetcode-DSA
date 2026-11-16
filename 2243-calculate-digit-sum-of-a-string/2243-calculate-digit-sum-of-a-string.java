class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>k){
            StringBuilder curr=new StringBuilder();
            int i=0;
            while(i<sb.length()){
                int temp=0;
                int sum=0;
                while(i<sb.length() && temp<k){
                    sum+=sb.charAt(i)-'0';
                    temp++;
                    i++;
                }
                curr.append(sum);
            }
            sb.setLength(0);
            sb.append(curr.toString());
        }
        return sb.toString();
    }
}
class Solution {
    public int[] minOperations(String boxes) {
        int[] res=new int[boxes.length()];
        int value=0;
        int sum=0;
        for(int i=0; i<boxes.length(); i++){
            res[i]=sum;
            value+=boxes.charAt(i)-'0';
            sum+=value;
        }
        value=0;
        sum=0;
        for(int i=boxes.length()-1; i>=0; i--){
            res[i]+=sum;
            value+=boxes.charAt(i)-'0';
            sum+=value;
        }
        return res;
    }
}
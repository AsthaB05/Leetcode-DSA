class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(j<spaces.length || i<s.length()){
            if(j<spaces.length && i==spaces[j] ){
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
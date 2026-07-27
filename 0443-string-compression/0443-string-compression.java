class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder(2000);
        if(chars.length==1){
            return 1;
        }
        char start=chars[0];
        int count=1;
        for(int i=1; i<chars.length; i++){
            if(start==chars[i]){
                count++;
            }else{
                sb.append(start);
                if(count>1){
                    sb.append(count);
                }
                count=1;
                start=chars[i];
            }
        }
        sb.append(start);
        if(count>1){
            sb.append(count);
        }
        for(int i=0; i<sb.length(); i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
        
    }
}
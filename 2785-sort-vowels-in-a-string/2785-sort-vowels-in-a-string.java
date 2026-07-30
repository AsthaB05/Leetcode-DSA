class Solution {
    public String sortVowels(String s) {
        List<Character> list=new ArrayList<>();
        char[] arr=s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        int i=0;
        int j=0;
        while(j<arr.length){
            if("aeiouAEIOU".indexOf(arr[j])!=-1){
                arr[j]=list.get(i);
                i++;
            }
            j++;
        }
        return new String(arr);

    }
}
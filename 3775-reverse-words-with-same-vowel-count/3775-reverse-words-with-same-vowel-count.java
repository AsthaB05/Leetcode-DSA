class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        HashSet<Character> vowel=new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        int count=0;
        for(int i=0; i<words[0].length(); i++){
            if(vowel.contains(words[0].charAt(i))){
                count++;
            }
        }
        for(int j=1; j<words.length; j++){
            int count2=0;
            for(int k=0; k<words[j].length(); k++){
                if(vowel.contains(words[j].charAt(k))){
                    count2++;
                }
            }
            if(count==count2){
                words[j]=new StringBuilder(words[j]).reverse().toString();
            }
        }
        return String.join(" ",words);

    }
}
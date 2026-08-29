class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int len1=0;
        int count1=0;
        int count2=0;
        int low1=0;
        int high1=0;
        while(high1<answerKey.length()){
            if(answerKey.charAt(high1)=='F'){
                count1++;
            }else{
                count2++;
            }
            while(Math.min(count1,count2)>k){
                if(answerKey.charAt(low1)=='F'){
                    count1--;
                }else{
                    count2--;
                }
                low1++;
            }
            len1=Math.max(len1,high1-low1+1);
            high1++;

        }
        return len1;
        // int len2=0;
        // int count2=0;
        // int low2=0;
        // int high2=0;
        // while(high2<answerKey.length()){
        //     if(answerKey.charAt(high2)=='T'){
        //         count2++;
        //     }
        //     while(count2>k){
        //         if(answerKey.charAt(low2)=='T'){
        //             count2--;
        //         }
        //         low2++;
        //     }
        //     len2=Math.max(len2,high2-low2+1);
        //     high2++;

        // }
        // return Math.max(len1,len2);

    }
}
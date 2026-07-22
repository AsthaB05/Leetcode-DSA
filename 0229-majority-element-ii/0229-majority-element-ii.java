class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int candi1=0;
        int candi2=0;
        int count1=0;
        int count2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==candi1){
                count1++;
            }else if(nums[i]==candi2){
                count2++;
            }
            else if(count1==0){
                candi1=nums[i];
                count1++;
            }else if(count2==0){
                candi2=nums[i];
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==candi1){
                count1++;
            }
            else if(nums[i]==candi2){
                count2++;
            }
        }
        if(count1>nums.length/3){
            list.add(candi1);
        }
        if(count2>nums.length/3){
            list.add(candi2);
        }


        return list;
    }
}
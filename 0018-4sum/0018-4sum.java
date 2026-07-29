class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        int p=0;
        while(p<nums.length-3){
            int q=p+1;
            while(q<nums.length-2){
                int i=q+1;
                int j=nums.length-1;
                while(i<j){
                    List<Integer> list=new ArrayList<>();
                    long calc=(long)nums[p]+nums[q]+nums[i]+nums[j];
                    if(calc==target){
                        list.add(nums[p]);
                        list.add(nums[q]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        if(!set.contains(list)){
                            set.add(list);
                            res.add(list);
                        }
                        
                        i++;
                        j--;
                    }else if(calc<target){
                        i++;
                    }else{
                        j--;
                    }
                }
                q++;
            }
            p++;
        }
        return res;
    }
}
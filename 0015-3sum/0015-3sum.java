class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();

        int i=0;
        while(i<nums.length-2){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int n=nums[i]+nums[j]+nums[k];
                if(n==0 ){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(n<0){
                    j++;
                }else{
                    k--;
                }
            }
            i++;
        }
        Set<List<Integer>> set=new LinkedHashSet<>(list);
        list=new ArrayList(set);

        return list;
    }
}
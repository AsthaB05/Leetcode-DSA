class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            list.add(index[i],nums[i]);
            i++;
        }
        int[] res=new int[nums.length];

        for(int j=0; j<list.size(); j++){
            res[j]=list.get(j);
        }
        return res;
    }
}
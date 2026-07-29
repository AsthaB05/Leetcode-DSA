class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int p=0;
        while(p<nums.length-3){
            while(p<nums.length-3 && p>0 && nums[p-1]==nums[p]){
                p++;
            }
            int q=p+1;
            while(q<nums.length-2){
                while(q<nums.length-2 && q>p+1 && nums[q-1]==nums[q]){
                    q++;
                }
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
                        res.add(list);
                        i++;
                        j--;
                        while(i<j && nums[i]==nums[i-1]){
                            i++;
                        }
                        while(i<j && nums[j]==nums[j+1]){
                            j--;
                        }
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
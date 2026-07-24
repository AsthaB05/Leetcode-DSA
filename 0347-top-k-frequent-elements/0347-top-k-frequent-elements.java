class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
       
        int[] res=new int[k];
        for(int i=0; i<k; i++){
            res[i]=list.get(i).getKey();
        }
        return res;
    }
}
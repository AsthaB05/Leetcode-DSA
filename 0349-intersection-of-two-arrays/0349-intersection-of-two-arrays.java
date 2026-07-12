class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();

        List<Integer> list=new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            if(!map1.containsKey(nums1[i])){
                map1.put(nums1[i],i);
            }
            
        }
        for(int i=0; i<nums2.length; i++){
            if(!map2.containsKey(nums2[i])){
                map2.put(nums2[i],i);
            }
            
        }       
        for(Integer key: map1.keySet()){
            if(map2.containsKey(key)){
                list.add(key);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
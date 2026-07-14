class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq=new int[1001];
        int[] res=new int [arr1.length];
        for(int i=0; i<arr1.length; i++){
            freq[arr1[i]]++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<arr2.length; i++){
            while(freq[arr2[i]]!=0){
                list.add(arr2[i]);
                freq[arr2[i]]--;
            }
        }

        for(int i=0; i<list.size(); i++){
            res[i]=list.get(i);
        }
        int idx=list.size();
        for(int i=0; i<1001; i++){
            while(freq[i]>0){
                res[idx]=i;
                idx++;
                freq[i]--;
            }
        }
        

        return res;

    }
}
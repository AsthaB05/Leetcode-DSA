class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy=Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int[] res=new int[arr.length];
        HashMap<Integer, Integer> map=new HashMap<>();

        int count=1;
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(copy[i])){
                map.put(copy[i],count);
                count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            res[i]=map.get(arr[i]);
        }
        return res;

    }
}
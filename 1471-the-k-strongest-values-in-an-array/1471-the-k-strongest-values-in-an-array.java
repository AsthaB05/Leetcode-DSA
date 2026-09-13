class Solution {
    public int[] getStrongest(int[] arr, int k) {
        if(arr.length<=1){
            return arr;
        }
        Arrays.sort(arr);
        int m=arr[(arr.length-1)/2];
        int left=0;
        int right=arr.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(left<=right && list.size()<=k){
            if(Math.abs(arr[left]-m)>Math.abs(arr[right]-m)){
                list.add(arr[left]);
                left++;
            }else if(Math.abs(arr[left]-m)<Math.abs(arr[right]-m)){
                list.add(arr[right]);
                right--;
            }else{
                if(arr[right]>arr[left]){
                    list.add(arr[right]);
                    right--;
                }else{
                    list.add(arr[left]);
                    left++;
                }
            }
        }
        int[] res=new int[k];
        for(int i=0; i<k; i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
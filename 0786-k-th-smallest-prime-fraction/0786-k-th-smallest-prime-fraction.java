class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] res=new int[2];
        List<int[]> list=new ArrayList<>();
        for(int i=0; i<arr.length; i++){           
            for(int j=i+1; j<arr.length; j++){
                list.add(new int[]{arr[i], arr[j]});  
            }            
        }
        list.sort((a,b)->Double.compare((double)a[0]/a[1],(double)b[0]/b[1]));
        return list.get(k-1);
    }
}
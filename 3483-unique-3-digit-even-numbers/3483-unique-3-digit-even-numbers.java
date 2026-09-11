class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j!=i){
                    for(int k=0; k<n; k++){
                        if(k!=i && k!=j){
                            if(digits[k]%2==0){
                                int num=(digits[i]*100)+(digits[j]*10) + digits[k];
                                if(num>99){
                                    set.add(num);
                                }
                            }
                        }
                    }
                }
            }
        }
        return set.size();
    }
}
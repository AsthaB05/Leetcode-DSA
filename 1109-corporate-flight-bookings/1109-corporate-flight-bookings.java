class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res=new int[n];
        int[] diff=new int[n+2];
        for(int i=0; i<bookings.length; i++){
            diff[bookings[i][0]]+=bookings[i][2];
            diff[bookings[i][1]+1]-=bookings[i][2];
        } 
        for(int i=1; i<diff.length; i++){
            diff[i]+=diff[i-1];
        }
        for(int i=0; i<n; i++){
            res[i]=diff[i+1];
        }
        return res;
    }
}
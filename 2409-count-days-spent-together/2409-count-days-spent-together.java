class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] mon={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=1; i<mon.length; i++){
            mon[i]+=mon[i-1];
        }
        int arrAlice=0;
        int leAlice=0;
        int arrBob=0;
        int leBob=0;

        if(Integer.parseInt(arriveAlice.substring(0,2))>1){
            arrAlice=mon[Integer.parseInt(arriveAlice.substring(0,2))-2]+Integer.parseInt(arriveAlice.substring(3,5));
        }else{
            arrAlice=Integer.parseInt(arriveAlice.substring(3,5));
        }

        if(Integer.parseInt(leaveAlice.substring(0,2))>1){
            leAlice=mon[Integer.parseInt(leaveAlice.substring(0,2))-2]+Integer.parseInt(leaveAlice.substring(3,5));
        }else{
            leAlice=Integer.parseInt(leaveAlice.substring(3,5));
        }
        
        if(Integer.parseInt(arriveBob.substring(0,2))>1){
            arrBob=mon[Integer.parseInt(arriveBob.substring(0,2))-2]+Integer.parseInt(arriveBob.substring(3,5));
        }else{
            arrBob=Integer.parseInt(arriveBob.substring(3,5));
        }

        if(Integer.parseInt(leaveBob.substring(0,2))>1){
            leBob=mon[Integer.parseInt(leaveBob.substring(0,2))-2]+Integer.parseInt(leaveBob.substring(3,5));
        }else{
            leBob=Integer.parseInt(leaveBob.substring(3,5));
        }
        
        return Math.max(0,Math.min(leAlice,leBob)-Math.max(arrAlice,arrBob)+1);

    }

}
class Solution {
    public int findDelayedArrivalTime(int aTime, int dTime) {
        int train_time=aTime + dTime;
        if(train_time!=24 && train_time<24){
            return train_time;
        }
        else if(train_time>24){
            return train_time-24;
        }
        else{
            return 0;
        }
    }
}
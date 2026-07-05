class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hr, int t) {
        int cnt=0;
        for(int emp:hr){
            if(emp>=t) cnt++;
        }
        return cnt;
    }
}
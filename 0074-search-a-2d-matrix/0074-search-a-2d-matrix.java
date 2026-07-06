class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        if(m==null || m.length==0 || m[0].length==0) return false;
        int row=m.length;
        int col=m[0].length;
        int low=0;
        int high=row*col-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int r=mid/col;
            int c=mid%col;
            if(m[r][c]==t) return true;
            else if(m[r][c]<t) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
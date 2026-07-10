class Solution {
    public boolean isMonotonic(int[] A) {
        int i=0; int j=A.length-1;
        boolean inc=false;
        boolean dec=false;
        while(i<j){
            if(A[i]<A[i+1]) inc=true;
            if(A[i]>A[i+1]) dec=true;
            if(A[j]>A[j-1]) inc=true;
            if(A[j]<A[j-1]) dec=true;

            if(inc && dec) return false;
            i++;
            j--;
        }  
        return true;
    }
}
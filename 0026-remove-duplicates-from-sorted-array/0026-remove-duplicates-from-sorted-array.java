class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length==0) return 0;
        int i=1, j=A.length; int non_dup=1;
        while(i<j){
            if(A[i]!=A[i-1]){
                A[non_dup] = A[i]; 
                 non_dup++;
            }
            i++;
        }
        return non_dup;
    }
}
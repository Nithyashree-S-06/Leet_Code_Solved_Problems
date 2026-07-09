class Solution {
    public int removeElement(int[] A, int val) {
        int non_val=0;
        for(int i=0; i<A.length; i++){
            if(A[i]!=val){
                A[non_val]=A[i];
                non_val++;
            }
        }
        return non_val;
    }
}
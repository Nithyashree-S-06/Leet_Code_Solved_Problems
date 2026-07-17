class Solution {
    public int absDifference(int[] A, int k) {
        Arrays.sort(A);
        int small=0, large=0;
        for(int i=0; i<k; i++){
            small+=A[i];
            large+=A[A.length-1-i];
        }
        return large-small;
    }
}
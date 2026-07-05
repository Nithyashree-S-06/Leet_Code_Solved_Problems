class Solution {
    public int[] shuffle(int[] A, int n) {
        int i=0; int j=n;
        int ans[] = new int[n*2];
        for(int k=0; k<n*2; k++){
            ans[k++] = A[i];
            i++;
            ans[k]=A[j];
            j++;
        }
        return ans;
    }
}
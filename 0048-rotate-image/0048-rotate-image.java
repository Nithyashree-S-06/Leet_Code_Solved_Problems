class Solution {
    public void rotate(int[][] A) {
        transpose(A);
        for(int i=0; i<A.length; i++){
            reverse(A[i]);
        }
    }
    public void transpose(int [][] A){
        int r=A.length; int c=A[0].length;
        for(int i=0; i<r; i++){
            for(int j=i+1; j<c; j++){
                int t=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=t;
            }
        }
    }
    public void reverse(int A[]){
        int i=0, j=A.length-1;
        while(i<j){
            int t=A[i];
            A[i]=A[j];
            A[j]=t;
            i++;
            j--;
        }
    }
}
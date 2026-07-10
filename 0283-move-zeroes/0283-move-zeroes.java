class Solution {
    public void moveZeroes(int[] A) {
        int i=0; int j=0;
        int temp=0;
        while(j<A.length){
            if(A[j]!=0) {
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
            }
            j++;
        }
        System.out.println(A);
    }
}
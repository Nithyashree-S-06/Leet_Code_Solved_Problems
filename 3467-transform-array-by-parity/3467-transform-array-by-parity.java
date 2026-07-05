class Solution {
    public int[] transformArray(int[] A) {
        int [] arr=new int[A.length];
        for(int i=0; i<A.length; i++){
            if(A[i]%2==0) arr[i]=0;
            else if(A[i]%2!=0) arr[i]=1;
        }
        Arrays.sort(arr);
        return arr;  
    }
}
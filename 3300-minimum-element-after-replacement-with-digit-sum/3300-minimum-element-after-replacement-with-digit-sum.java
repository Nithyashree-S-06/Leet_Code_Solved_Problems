class Solution {
    public int minElement(int[] A) {
        int minsum=Integer.MAX_VALUE;
        for(int n: A){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            minsum=Math.min(minsum, sum);
        }
        return minsum;
    }
}
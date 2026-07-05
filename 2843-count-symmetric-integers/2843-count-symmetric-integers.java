class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (i >= 10 && i <= 99) {
                if (i / 10 == i % 10) {
                    count++;
                }
            } 
            else if (i >= 1000 && i <= 9999) {
                int left = i / 100;
                int right = i % 100;
                
                int leftSum = (left / 10) + (left % 10);
                int rightSum = (right / 10) + (right % 10);
                if (leftSum == rightSum) {
                    count++;
                }
            }
        }    
        return count;
    }
}
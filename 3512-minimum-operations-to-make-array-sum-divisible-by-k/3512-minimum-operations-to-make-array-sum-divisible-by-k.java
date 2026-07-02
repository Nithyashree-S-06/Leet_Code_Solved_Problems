class Solution {
    public int minOperations(int[] A, int k) {
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        return sum % k;
    }
}
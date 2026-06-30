class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        boolean[] seen = new boolean[201];
        int count = 0;
        for (int num : nums) {
            seen[num] = true;
        }
        for (int num : nums) {
            if (num + diff <= 200 && num + 2 * diff <= 200) {
                if (seen[num + diff] && seen[num + 2 * diff]) {
                    count++;
                }
            }
        }
        return count;
    }
}
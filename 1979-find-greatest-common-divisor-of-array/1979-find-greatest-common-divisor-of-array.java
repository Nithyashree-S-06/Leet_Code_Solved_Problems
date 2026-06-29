class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int mn = nums[0];              
        int mx = nums[nums.length - 1]; 
        for (int i = mn; i >= 1; i--) {
            if (mn % i == 0 && mx % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
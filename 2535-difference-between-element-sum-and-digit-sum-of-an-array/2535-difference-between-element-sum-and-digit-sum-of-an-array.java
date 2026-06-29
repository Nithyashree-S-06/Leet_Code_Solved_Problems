class Solution {
    public int differenceOfSum(int[] nums) {
        int element = 0;
        int digit = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            element+= n; 
            
            while (n > 0) {
                digit+= n % 10;
                n /= 10;
            }
        }
        
        return (element- digit);
    }
}
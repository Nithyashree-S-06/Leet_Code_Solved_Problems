class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int maxDigit = 0;
            int length = 0; 

            while (n > 0) {
                int digit = n % 10;
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                length++;
                n /= 10;
            } 
                       
            int encryptedValue = 0;
            for (int j = 0; j < length; j++) {
                encryptedValue = encryptedValue * 10 + maxDigit;
            }
            
            sum += encryptedValue;
        }
        
        return sum;
    }
}
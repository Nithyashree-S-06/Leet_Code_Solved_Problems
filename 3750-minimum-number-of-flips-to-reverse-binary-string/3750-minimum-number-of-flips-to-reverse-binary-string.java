class Solution {
    public int minimumFlips(int n) {
        String Bin_Str=Integer.toBinaryString(n);
       int left = 0;
       int right = Bin_Str.length() - 1;
       int flips = 0;
       while (left < right) {
        if (Bin_Str.charAt(left) != Bin_Str.charAt(right)) {
            flips += 2; 
        }
        left++;
        right--;
        }
        return flips;

    }
}
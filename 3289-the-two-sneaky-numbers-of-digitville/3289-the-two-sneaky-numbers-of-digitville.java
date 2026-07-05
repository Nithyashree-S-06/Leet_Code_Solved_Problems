class Solution {
    public int[] getSneakyNumbers(int[] A) {
        int[] arr = new int[2];
        int[] count = new int[A.length]; 
        int index = 0;
        for (int num : A) {
            count[num]++;
            if (count[num] == 2) {
                arr[index++] = num;
            }
        }
        return arr;
    }
}
class Solution {
    public int maximumWealth(int[][] acc) {
        int max=0;
        for(int[] cus:acc){
            int cur_wealth=0;
            for(int bank:cus){
                cur_wealth+=bank;
            }
            max=Math.max(max, cur_wealth);
        }
        return max;
    }
}
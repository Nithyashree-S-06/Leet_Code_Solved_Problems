class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max=0; int sum=0;
        for(int key:nums){
            hm.put(key, hm.getOrDefault(key,0)+1);
            max=Math.max(max, hm.get(key));
        }
        for(int val:hm.values()){
            if(val==max) sum+=val;
        }
        return sum;
    }
}
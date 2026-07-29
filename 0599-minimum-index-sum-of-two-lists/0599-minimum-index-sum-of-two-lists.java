class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {
        List<String> res = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < l1.length; i++) {
            for (int j = 0; j < l2.length; j++) { 
                if (l1[i].equals(l2[j])) {      
                    int sum = i + j;
                    if (sum < minSum) {
                        minSum = sum;
                        res.clear();
                        res.add(l1[i]);
                    } else if (sum == minSum) {
                        res.add(l1[i]);
                    }
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
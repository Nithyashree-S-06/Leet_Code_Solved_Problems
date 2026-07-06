class MyHashMap {
    // We just store pairs of [key, value] in a dynamic list
    private List<int[]> map;

    public MyHashMap() {
        map = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        // If the key already exists, update its value and return
        for (int[] pair : map) {
            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }
        // If it's a new key, add it to the list
        map.add(new int[]{key, value});
    }
    
    public int get(int key) {
        // Search the list for the key
        for (int[] pair : map) {
            if (pair[0] == key) {
                return pair[1];
            }
        }
        return -1; // Not found
    }
    
    public void remove(int key) {
        // Search and remove the pair if it exists
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i)[0] == key) {
                map.remove(i);
                return;
            }
        }
    }
}
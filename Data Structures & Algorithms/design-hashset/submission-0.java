class MyHashSet {
    private List<Integer> arr;

    public MyHashSet() {
        arr = new ArrayList<>();
    }

    public boolean contains(int key) {
        for(int i: arr){
            if (key==i) return true;
        }
        return false;
    }
    
    public void add(int key) {
        if(contains(key)) return;
        arr.add(key);
    }
    
    public void remove(int key) {
        arr.remove(Integer.valueOf(key));
    }
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
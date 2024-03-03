package Data_Structures.Libraries_Implementations.LRUCache;

/*
Question
Implement the following Class:

    public class LRUCache<K, V> {
        public LRUCache(int maxCapacity) {
            // Implement this function
        }

        public void put(K key, V value) {
            // Implement this function
        }

        public V get(K key) {
            // Implement this function
        }

        // Add anything you might need
    }

• The class saves entries of Key & Value
• The class has a maximum capacity
• Once max capacity is reached, new entries will push out the least recently used entry
• The time complexity of *put* and *get* should be O(1)
*/

import java.util.LinkedHashMap;

public class LRUCache1<K, V> {
    private final LinkedHashMap<K, V> map;

    public LRUCache1(int capacity){
        this.map = new LinkedHashMap<>(capacity);
    }

    public void put(K key, V value){
        map.put(key, value);
    }

    public V get(K key){
        V value = map.get(key);
        if (null != value){
            map.remove(key);
            map.put(key, value);
        }
        return value;
    }
}

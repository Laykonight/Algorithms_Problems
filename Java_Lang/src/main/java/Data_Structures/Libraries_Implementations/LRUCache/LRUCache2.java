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

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class LRUCache2<K, V> {
    private final int capacity;
    private final Map<K, Node> map;
    private Node head;
    private Node tail;

    public LRUCache2(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();

        this.head = new Node(null, null);
        this.tail = new Node(null, null);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public void put(K key, V value){
        if (map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            // after use move to most used
            moveToHead(node);
            return;
        }
        if (map.size() == capacity){
            removeTail();
        }
        Node newNode = new Node(key, value);
        addToFront(newNode);
        map.put(key, newNode);
    }

    private void moveToHead(Node node){
        removeNode(node);
        addToFront(node);
    }

    private void addToFront(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void removeTail(){
        Node last = tail.prev;
        removeNode(last);
        map.remove(last.key);
    }

    //---------------------------------
    private class Node{
        private K key;
        private V value;
        private Node prev;
        private Node next;
        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}

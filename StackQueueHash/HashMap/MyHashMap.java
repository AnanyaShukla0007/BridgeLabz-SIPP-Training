import java.util.*;

class MyHashMap {
    static class Entry {
        int key, value;
        Entry next;
        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10;
    private Entry[] buckets = new Entry[SIZE];

    private int hash(int key) {
        return Math.abs(key) % SIZE;
    }

    public void put(int key, int value) {
        int i = hash(key);
        Entry head = buckets[i];
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Entry newNode = new Entry(key, value);
        newNode.next = buckets[i];
        buckets[i] = newNode;
    }

    public Integer get(int key) {
        int i = hash(key);
        Entry head = buckets[i];
        while (head != null) {
            if (head.key == key) return head.value;
            head = head.next;
        }
        return null;
    }

    public void remove(int key) {
        int i = hash(key);
        Entry head = buckets[i], prev = null;
        while (head != null) {
            if (head.key == key) {
                if (prev == null) buckets[i] = head.next;
                else prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}

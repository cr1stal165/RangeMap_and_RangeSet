package vsu.ru.silnov;

import java.util.ArrayList;

public class RangeMap<K,V> {

    public Object[] elements;
    public int size = 256;

    public RangeMap() {
        elements = new Object[size];
    }

    @SuppressWarnings("unchecked")
    public void put(K key, V value) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % elements.length);
        Entry<K, V> entry = new Entry<>(hashCode, key, value);
        if (elements[index] == null) {
            elements[index] = entry;
        } else {
            Entry<K, V> node = (Entry<K, V>) elements[index];
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(entry);
        }
    }

    @SuppressWarnings("unchecked")
    public void put(K key, int from, int to) {
        Range range = new Range(from,to);
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % elements.length);
        Entry<K, V> entry = new Entry(hashCode, key, range);
        if (elements[index] == null) {
            elements[index] = entry;
        } else {
            Entry<K, V> node = (Entry<K, V>) elements[index];
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(entry);
        }
    }

    @SuppressWarnings("unchecked")
    public V remove(K key) {
        int hashCode = key.hashCode();

        int index = Math.abs(hashCode % elements.length);

        if (elements[index] != null) {
            Entry<K, V> node = (Entry<K, V>) elements[index];
            Entry<K, V> next = node.getNext();
            Entry<K, V> prev = node;

            while (node != null) {
                if (node.getHashCode() == hashCode) {
                    if (key.equals(node.getKey())) {
                        V valueToReturn = node.getValue();
                        if (prev == node) {
                            elements[index] = node.getNext();
                        } else {
                            prev.setNext(node.getNext());
                        }
                        return valueToReturn;
                    }
                }
                prev = node;
                node = next;
                if (next != null)
                    next = next.getNext();
            }
        }
        return null;
    }

    private int index(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % size);
    }

    @SuppressWarnings("unchecked")
    private Entry<K, V> getEntry(K key, int index) {
        if (index < 0) {
            index = index(key);
        }
        for (Entry<K, V> curr = (Entry<K, V>) elements[index]; curr != null; curr = curr.getNext()) {
            if (key.equals(curr.getKey())) {
                return curr;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        return getEntry(key, -1) != null;
    }

    public K searchKey(K key) {
        if (containsKey(key)) {
            return key;
        } else {
            return null;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public String toString() {
        StringBuilder str = new StringBuilder(" ");
        for (int i = 0; i < size; i++) {
            if (elements[i] != null) {
                Entry<K, V> currentNode = (Entry<K, V>) elements[i];
                while (currentNode != null) {
                    str.append(currentNode);
                    str.append(", ");
                    currentNode = currentNode.getNext();
                }
            }
        }
        return str.toString();
    }
}
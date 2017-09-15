package com.company.search;

import java.util.Iterator;

/**
 * 顺序查找，基于无序链表
 */
public class SequentialSearchST<Key, Value> {
    private Node first;

    private class Node {
        Key key;
        Value val;
        Node next; //下一个链表的位置

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) return x.val; //命中
        }
        return null;
    }

    public void put(Key key, Value val) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        first = new Node(key, val, first);
    }

    public int size() { //表中键值对的数量
        int size = 0;
        for (Node x = first; x != null; x = x.next) {
            size ++;
        }
        return size;
    }

    public void delete(Key key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {

            }
        }
    }

    public Iterable<Key> keys() {
        Iterable<Key> iterable = new Iterable<Key>() {
            @Override
            public Iterator<Key> iterator() {
                return null;
            }
        };
        return iterable;
    }
}

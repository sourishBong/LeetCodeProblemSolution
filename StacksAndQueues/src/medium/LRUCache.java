package medium;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LRUCache {

    class DlinkedNode {
        int key;
        int value;
        DlinkedNode next;
        DlinkedNode prev;
    }

    private Map<Integer, DlinkedNode>
            cache = new HashMap<Integer, DlinkedNode>();
    private int count;
    private int capacity;
    private DlinkedNode head, tail;
        /**
         * Always add the new node right after head;
         */
        private void addNode(DlinkedNode node){

            node.prev=head;
            node.next=head.next;

            head.next.prev=node;
            head.next=node;

        }

    /**
     * Remove an existing node from the linked list.
     */
    private void removeNode(DlinkedNode node){
        DlinkedNode pre=node.prev;
        DlinkedNode post=node.next;

        pre.next=post;
        post.prev=pre;
    }

    /**
     * Move certain node in between to the head.
     */
    private void moveToHead(DlinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }

    // pop the current tail.
    private DlinkedNode popTail(){
        DlinkedNode res = tail.prev;
        this.removeNode(res);
        return res;
    }

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;

        head = new DlinkedNode();
        head.prev = null;

        tail = new DlinkedNode();
        tail.next = null;

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DlinkedNode node = cache.get(key);

        if(node == null){
            return -1; // should raise exception here.
        }

        // move the accessed node to the head;
        this.moveToHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        DlinkedNode node = cache.get(key);

        if(node == null){

            DlinkedNode newNode = new DlinkedNode();
            newNode.key = key;
            newNode.value = value;

            this.cache.put(key, newNode);
            this.addNode(newNode);

            ++count;

            if(count > capacity){
                // pop the tail
                DlinkedNode tail = this.popTail();
                this.cache.remove(tail.key);
                --count;
            }
        }else{
            // update the value.
            node.value = value;
            this.moveToHead(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

package LeetCode.DesignNote;

import java.util.Hashtable;

/**
* @Description:    LRU缓存机制，https://leetcode-cn.com/problems/lru-cache/
* @Author:         kirago
* @CreateDate:     2020/1/14 3:57 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LRUCache {

    private Hashtable<Integer, DLinkNode> cache = new Hashtable<>();
    private int size,capacity;
    private DLinkNode head,tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DLinkNode();
        tail = new DLinkNode();

        head.next = tail;
        tail.pre = head;
    }

    class DLinkNode {
        int key;
        int value;
        DLinkNode pre;
        DLinkNode next;
    }


    /** 添加节点只在头部之后添加
     *
     * @param node
     */
    private void addNode(DLinkNode node) {

        node.pre = head;
        node.next = head.next;

        head.next.pre = node;
        head.next = node;
    }

    /**
     * @param node
     */
    private void removeNode(DLinkNode node) {
        DLinkNode pre = node.pre;
        DLinkNode next = node.next;

        pre.next = next;
        next.pre = pre;
    }

    /**
     * @param node
     */
    private void moveToHead(DLinkNode node) {
        removeNode(node);
        addNode(node);
    }

    /**弹出底部节点并返回
     *
     * @return DLinkNode
     */
    private DLinkNode popTail() {
        DLinkNode res = tail.pre;
        removeNode(res);
        return res;
    }

    public int get(int key) {
        DLinkNode node = cache.get(key);
        if(node == null) return -1;
        moveToHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        DLinkNode node = cache.get(key);
        if(node == null) {
            DLinkNode newNode = new DLinkNode();
            newNode.key = key;
            newNode.value = value;

            cache.put(key, newNode);
            addNode(newNode);

            ++size;
            if(size > capacity) {
                DLinkNode tail = popTail();
                cache.remove(tail.key);
                --size;
            }
        }else {
            node.value = value;
            moveToHead(node);
        }
    }
}

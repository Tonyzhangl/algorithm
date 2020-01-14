package LeetCode.DesignNote;

import java.util.LinkedHashMap;
import java.util.Map;

/**
* @Description:    LRU缓存机制，https://leetcode-cn.com/problems/lru-cache/
* @Author:         kirago
* @CreateDate:     2020/1/14 2:56 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LRUCacheSolution extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public LRUCacheSolution(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key){
        return this.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> oldest) {
        return size() > capacity;
    }
}

package LRU;

/**
* @Description:    借用 LinkHashMap 原生实现 LRU 算法
* @Author:         kirago
* @CreateDate:     2019/10/12 3:08 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

//---------
//public LinkedHashMap(int var1, float var2) {
//        super(var1, var2);
//        this.accessOrder = false;
//        }

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Constructs an empty <tt>HashMap</tt> with the specified initial
 * capacity and load factor.
 *
 * @param  initialCapacity the initial capacity
 * @param  loadFactor      the load factor
 * @throws IllegalArgumentException if the initial capacity is negative
 *         or the load factor is nonpositive
 */
//public HashMap(int initialCapacity, float loadFactor) {
//        if (initialCapacity < 0)
//        throw new IllegalArgumentException("Illegal initial capacity: " +
//        initialCapacity);
//        if (initialCapacity > MAXIMUM_CAPACITY)
//        initialCapacity = MAXIMUM_CAPACITY;
//        if (loadFactor <= 0 || Float.isNaN(loadFactor))
//        throw new IllegalArgumentException("Illegal load factor: " +
//        loadFactor);
//        this.loadFactor = loadFactor;
//        this.threshold = tableSizeFor(initialCapacity);
//        }
public class LinkHashMapDemo {

    public static void main(String[] args) {
        int cacheSize = 3;
        // 最大容量 = （缓存大小 / 负载因子）+ 1，保证不会触发自动扩容
        LinkedHashMap<String, String> cache = new LinkedHashMap<String, String>(
                (int)(cacheSize/ 0.75f) + 1, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cacheSize;
            }
        };

        cache.put("1", "a");
        cache.put("2", "b");
        cache.put("3", "c");

        // head => "1" => "2" => "3" => null

        // put已存在的值，和get方法是一样的效果
        cache.put("1", "a");

        // head => "2" => "3" => "1" => null;

        cache.put("4", "d");

        // head => "3" => "1" => "4" => null;

        for (String key: cache.keySet()) {
            System.out.println(key);
        }

    }
}

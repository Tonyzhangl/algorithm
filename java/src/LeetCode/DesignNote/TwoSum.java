package LeetCode.DesignNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
* @Description:    两数之和 III - 数据结构设计,https://leetcode-cn.com/problems/two-sum-iii-data-structure-design/
* @Author:         kirago
* @CreateDate:     2020/4/22 2:55 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class TwoSum {
    private List<Integer> list;
    private HashMap<Integer,List<Integer>> map ;
    /** Initialize your data structure here. */
    public TwoSum() {
        this.list = new ArrayList();
        map = new HashMap<Integer,List<Integer>>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        list.add(number);
        if(!map.containsKey(number)) map.put(number,new ArrayList());
        map.get(number).add(list.size()-1);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(int  i=0;i<list.size();i++){
            int diff = value - list.get(i);
            if(diff == list.get(i) && map.get(diff).size()>1) return true;
            if(map.get(diff) != null && diff != list.get(i)) return true;
        }
        return false;
    }
}

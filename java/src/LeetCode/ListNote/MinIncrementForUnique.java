package LeetCode.ListNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
* @Description:    使数组唯一的最小增量,https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique/
* @Author:         kirago
* @CreateDate:     2020/2/26 5:51 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MinIncrementForUnique {

//    暴力解法，超出时间限制
    public int minIncremenForUnique(int[] A){
        List<Integer> list =  Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> tmp = new ArrayList<>();
        int ans =0;
        for(int item:A){
            while(tmp.contains(item)){
                item++;
                ans++;
            }
            tmp.add(item);
        }
        return ans;

    }

    public int minIncremenForUnique1(int[] A) {
        int ans = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int item : A) {
            if (hashMap.containsKey(item)) {
                hashMap.put(item, hashMap.get(item) + 1);
            } else {
                hashMap.put(item, 1);
            }
        }

        for (int i = 0; i < A.length; i++) {
            int key = A[i];
            while (hashMap.get(key) > 1 ) {
                // update count
                hashMap.put(key, hashMap.get(key) - 1);
                key++;
                ans++;
                if(!hashMap.containsKey(key)){
                    hashMap.put(key,1);
                    break;
                }
                hashMap.put(key,hashMap.get(key)+1);
            }

        }
        return ans;
    }

//    借鉴官方题解
    public int minIncremenForUnique2(int[] A){
        int[] count = new int[10000];
        for (int x: A) count[x]++;

        int ans = 0, taken = 0;

        for (int x = 0; x < 10000; ++x) {
            if (count[x] >= 2) {
                taken += count[x] - 1;
                ans -= x * (count[x] - 1);
            }
            else if (taken > 0 && count[x] == 0) {
                taken--;
                ans += x;
            }
        }

        return ans;
    }


}

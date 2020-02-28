package LeetCode.ListNote;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
* @Description:    加一，
* @Author:         kirago
* @CreateDate:     2020/2/28 1:13 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class PlusOne {
    boolean tag=true;

    public int[] plusOne(int[] digits) {
        int j=0,res=0;
        List<Integer> list = Arrays.stream(digits).boxed().collect(Collectors.toList());;
        for(int i=list.size()-1;i>=0;i--){
            int item = innerF(list.get(i));
            list.set(i,item);
            j++;
            if(i==0 && tag){
                list.add(0,1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    private int innerF(int val){
        int ans=0,res=0;
        res += tag ? (val+1)%10 : val;
        ans += tag ? val+1 : val;
        tag = (ans/10)!=0;
        return res;

    }
}

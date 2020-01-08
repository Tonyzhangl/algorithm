package CodeWars.StringNode;

import java.util.*;

/**
* @Description:    java类作用描述,https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/solutions/java
* @Author:         kirago
* @CreateDate:     2020/1/8 7:08 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CountingDuplicates {

    public static int duplicateCount(String text){
        String lowerText = text.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int sum=0;
        if(text.isEmpty() || text.length() == 1) return 0;
        for(int i=0;i<lowerText.length();i++) {
            if(!hashMap.containsKey(lowerText.charAt(i)) ){
                hashMap.put(lowerText.charAt(i), 0);
            }else {
                hashMap.put(lowerText.charAt(i),1);
            }
        }
        Collection collection = hashMap.values();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            sum += (Integer) iterator.next();
        }
        return sum;


    }

    public static void main(String[] args){
        duplicateCount("abcdeaBReturns");
    }
}

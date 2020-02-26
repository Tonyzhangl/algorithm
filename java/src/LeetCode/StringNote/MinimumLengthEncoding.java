package LeetCode.StringNote;

import java.util.Arrays;
import java.util.HashSet;

/**
* @Description:    单词的压缩编码,https://leetcode-cn.com/problems/short-encoding-of-words/
* @Author:         kirago
* @CreateDate:     2020/2/26 3:00 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MinimumLengthEncoding {

//    自解法，担当如果出现 "me" 在 "time" 之前的话就会导致bug，这样就得增加处理开销将字符串较长的放到单词数组的前面，不可取
    public int minimumLengthEncoding(String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String str:words){
            if(sb.toString().indexOf(str) == -1){
                sb.append(str+"#");
            }
        }
        return sb.toString().length();
    }

//    借鉴官方解法，存储后缀处理法
    public int minimumLengthEncoding1(String[] words){
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(words));
        for(String word:words){
            for(int i=1;i<word.length();i++){
                hashSet.remove(word.substring(i));
            }
        }
        int ans = 0;
        for(String word:hashSet){
            ans += word.length() + 1;
        }
        return ans;
    }
}

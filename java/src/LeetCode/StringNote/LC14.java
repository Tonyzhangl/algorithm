package LeetCode.StringNote;

/**
* @description:    14. 最长公共前缀
* @author:         kirago
* @date:     2021/1/27 2:10 下午
* @updateRemark:   修改内容
* @version:        1.0
*/
public class LC14 {
    public String longestCommonPrefix(String[] strs){
        if(strs.length==0) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length-1;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

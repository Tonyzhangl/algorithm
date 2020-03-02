package LeetCode;

/**
* @Description:    最长公共前缀 https://leetcode-cn.com/problems/longest-common-prefix/
* @Author:         kirago
* @CreateDate:     2019/11/24 1:57 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC14 {

    public static String longestCommonPrefix(String[] strs) {
        StringBuffer stringBuffer = new StringBuffer();
        if(strs.length == 0) return "";
        for(int i=0;i<strs[0].length();i++) {
            int j=1;
            while (j<=strs.length-1){
                try {
                    if (strs[j].charAt(i) == strs[0].charAt(i)) {
                        j++;
                    } else break;
                }catch (StringIndexOutOfBoundsException e){
                    return stringBuffer.toString();
                }
            }
            if(j== strs.length){
               stringBuffer.append(strs[0].charAt(i));
            }else {
               return stringBuffer.toString();
            }
        }
        if(stringBuffer == null) {
            return "";
        }
        return stringBuffer.toString();

    }

    public static String longestCommonPrefix1(String[] strs){
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"flow","flow","flow"};
        System.out.println(longestCommonPrefix(strings));
    }
}
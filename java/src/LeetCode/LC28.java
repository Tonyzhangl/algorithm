package LeetCode;
/**
* @Description:    实现strStr(),https://leetcode-cn.com/problems/implement-strstr/
* @Author:         kirago
* @CreateDate:     2019/11/25 12:28 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

public class LC28 {

    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()) {
            return 0;
        }
        int index = -1;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                index = i;
                int j=1;
                boolean flag=true;
                String tmp = haystack.substring(i);
                for(int in=1;in<needle.length();in++){
                    try{
                        if(tmp.charAt(in) == needle.charAt(j)){

                            j++;
                        }else {
                            flag = false;
                            index = -1;
                            break;
                        }
                    }catch (StringIndexOutOfBoundsException e) {
                        flag = false;
                        index = -1;
                        break;
                    }
                }
                if(j==needle.length() && flag){
                    return index;
                }else if ( j == needle.length() && !flag ){
                    return -1;
                }else if(j < needle.length()){
                    continue;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","sippj"));
    }
}

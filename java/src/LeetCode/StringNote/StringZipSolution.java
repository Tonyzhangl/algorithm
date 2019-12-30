package LeetCode.StringNote;

/**
* @Description:    压缩字符串，https://leetcode-cn.com/problems/string-compression/
* @Author:         kirago
* @CreateDate:     2019/12/30 9:36 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

public class StringZipSolution {

    public static int compress(char[] chars) {
        int anchor=0, write = 0;
        for(int read=0;read<chars.length;read++) {
            if(read +1 == chars.length || chars[read+1] != chars[read]) {
                chars[write++] = chars[anchor];
                if(read > anchor) {
                    for(char c:("" + (read - anchor + 1)).toCharArray()){
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        char[] chars = new char[]{'a','a','a','b','b','c'};
        int r = compress(chars);
        System.out.println(r);
    }
}

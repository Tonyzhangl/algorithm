package LeetCode;

import java.util.Arrays;

/**
* @Description:    二进制求和,https://leetcode-cn.com/problems/add-binary/
* @Author:         kirago
* @CreateDate:     2019/11/26 11:00 AM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC67 {
//    public static String addBinary(String a, String b) {
//        int aa = Integer.parseInt(a);
//        int bb = Integer.parseInt(b);
//        int cc = aa+bb;
//        String c = String.valueOf(cc);
//        int[] clist = new int[c.length()];
//        StringBuffer stringBuffer = new StringBuffer();
//        int tmp = 0;
//        for(int i=c.length()-1;i>=0;i--){
//            clist[i] = Integer.parseInt(String.valueOf(c.charAt(i))) + tmp;
//            tmp = 0;
//            if(clist[i] / 2 == 1) {
//                tmp = 1;
//                clist[i] = 0;
//            }
//        }
//        if(clist[0] == 0 && tmp == 1) {
//            int[] rlist = new int[clist.length+1];
//            stringBuffer.append("1");
//            for(int i=1;i<rlist.length;i++){
//               stringBuffer.append(clist[i-1]);
//            }
//
//        }else {
//            for(int i=0;i<clist.length;i++) {
//                stringBuffer.append(clist[i]);
//            }
//        }
//        return stringBuffer.toString();
        public static String addBinary(String a, String b) {
            StringBuilder stringBuilder = new StringBuilder();
            int ca = 0;
            for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--){
                int sum = ca;
                sum += i>=0 ? a.charAt(i) - '0' : 0;
                sum += j>=0 ? b.charAt(j) - '0' : 0;
                stringBuilder.append(sum % 2);
                ca = sum / 2;
            }
            stringBuilder.append( ca == 1 ? "1" : "");
            return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
}
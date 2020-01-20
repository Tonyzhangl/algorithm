package LeetCode.StringNote;

import java.util.HashMap;

/**
* @Description:    整数转罗马数字,https://leetcode-cn.com/problems/integer-to-roman/
* @Author:         kirago
* @CreateDate:     2020/1/20 3:36 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class IntoRoma {

    private HashMap<Double, String>  h =new HashMap<Double, String>(){
        {
            put(1.00, "I");
            put(4.00, "IV");
            put(5.00, "V");
            put(9.00, "IX");
            put(10.00, "X");
            put(40.00, "XL");
            put(50.00, "L");
            put(90.00, "XC");
            put(100.00, "C");
            put(400.00, "CD");
            put(500.00, "D");
            put(900.00, "CM");
            put(1000.00, "M");
        }
    };

    public String inToRoma(int num){
        StringBuilder sb = new StringBuilder();
        int i=0,j=num,k;
        while(j != 0){
            k = j % 10;
            double tmp = k * Math.pow(10, i);
            reverse(sb, tmp, i);
            j /= 10;
            i ++;
        }
        return sb.toString();
    }

    private void reverse(StringBuilder sb, double x, int y) {
        if(h.containsKey(x)){
            sb.insert(0, h.get(x));
        }else{
            double n=0;
            StringBuilder sbt = new StringBuilder();
            if( x > 5*Math.pow(10, y) ) {
                n = (x - 5*Math.pow(10,y))/Math.pow(10,y);
                sbt.append(h.get(5*Math.pow(10,y)));
                for(int i=0;i<n;i++){
                    sbt.append(h.get(Math.pow(10,y)));
                }
            }else{
                n = x / Math.pow(10,y);
                for(int i=0;i<n;i++) {
                    sbt.append(h.get(Math.pow(10,y)));
                }
            }
            sb.insert(0,sbt.toString());
        }

    }
}

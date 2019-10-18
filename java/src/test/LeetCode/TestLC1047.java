package test.LeetCode;

import LeetCode.LC1047;
import sun.jvm.hotspot.utilities.Assert;

public class TestLC1047 {

    public static void main(String[] args) {
        String s = "abbaca";
        LC1047 lc1047 = new LC1047();
        String r = lc1047.removeDuplicates(s);
        System.out.println(r);
    }
}

//https://leetcode-cn.com/problems/reverse-integer/

package LeetCode;

public class LC7 {
    public int reverse(int x) {
        long r = 0;
        while (x != 0) {
            r = r*10+x%10;
            x /= 10;
        }
        return (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) ? 0 : (int)r;
    }
}

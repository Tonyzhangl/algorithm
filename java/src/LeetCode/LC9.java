package LeetCode;

public class LC9 {

    public  static boolean isPalindrome (int x){
        int y = 0, tmp = x;
        if (x < 0) {
            return false;
        }
        while (tmp != 0) {
            y = y * 10 + tmp % 10;
            tmp /= 10;
        }
        if (y == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        if(isPalindrome(121)) {
            System.out.println("success");
        }
    }

}

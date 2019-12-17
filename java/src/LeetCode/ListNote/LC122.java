package LeetCode.ListNote;

/**
* @Description:    买卖股票的最佳时机2，https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
* @Author:         kirago
* @CreateDate:     2019/12/16 5:06 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC122 {
    /** --- 借鉴题解中的峰谷值图解法 -----**/
    /**
    public int maxProfit(int[] prices) {
        int sum = 0;
        if(prices.length == 0) return 0;
        int valley = prices[0];
        int peek = prices[0];
        int i = 1;
        while (i < prices.length - 1) {
            while ( i < prices.length - 1 && prices[i] >= prices[i+1]) {
                i++;
            }
            valley = prices[i];
            System.out.println(valley);
            while ( i < prices.length - 1 && prices[i] <= prices[i+1]) {
                i++;
            }
            peek = prices[i];

            sum += peek - valley;
        }
        return sum;
    }**/

    /** ----- 峰谷值图解法优化解 ------ **/
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i=1;i<prices.length;i++) {
            if(prices[i] > prices[i-1]) {
                sum += prices[i] - prices[i-1];
            }
        }
        return sum;
    }

}

package LeetCode.ListNote;

/**
* @Description:    买卖股票的最佳时期，https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
* @Author:         kirago
* @CreateDate:     2019/12/16 4:13 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LC121 {

    /** ------- 暴力破解法 -------
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0;i<prices.length;i++) {
            for(int j=i+1;j<prices.length;j++) {
                max = Math.max(prices[j] - prices[i], max);
            }
        }
        return max;
    }
     **/

    /** ------- 此解法通过两变量进行记录，通过 minprice 进行存储最小值，并且通过 maxprofit
     * 记录最大差价，当出现比最小值还小的元素的时候那么此时就是个分割点，这个是个彩蛋。
     * ------ **/
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] < minprice) {
                minprice = prices[i];
            }else if(prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
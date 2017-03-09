package Leetcode;
/*
 * 
 Say you have an array for which the ith element is the price of a given stock on day i.
 If you were only permitted to complete at most one transaction (ie, buy one and sell one 
 share of the stock), design an algorithm to find the maximum profit.
 
 是指先买入再卖出。求最大利润
 */
public class Q121_BestTimeToBuyAndSellStock {
	public static int maxProfit(int[] prices) {
		int maxCur=0,maxSoFar=0;
		for(int i=1;i<prices.length;i++){
			maxCur=Math.max(0,maxCur+=prices[i]-prices[i-1]);
			maxSoFar=Math.max(maxCur,maxSoFar);
		}
		return maxSoFar;
	}
	public static void main(String[] args) {
		int [] data={7,1,2,4,5,8};
		System.out.println(maxProfit(data));
	}
}


/*********************Time out**************
public int maxProfit(int[] prices) {
    int maxProfit=0;
    for(int i=0;i<prices.length-1;i++){
    	for(int j=i+1;j<prices.length;j++){
    		if(prices[j]>prices[i]){
    			if(maxProfit<prices[j]-prices[i]) maxProfit=prices[j]-prices[i];
    		}
    	}
    }
    return maxProfit;
}
*/
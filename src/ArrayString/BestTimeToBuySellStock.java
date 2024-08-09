package ArrayString;
/**
 * 121. Best Time to Buy and Sell Stock
 * Easy
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a 
 * different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuySellStock {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int buy = Integer.MAX_VALUE;
		int sell = 0;
		for(int i = 0; i < prices.length; i++){
			buy = Math.min(buy, prices[i]);
			sell = Math.max(sell, prices[i] - buy);
		}
		
		System.out.println(sell);
		

	}

}

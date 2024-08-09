package ArrayString;
/**
 * 122. Best Time to Buy and Sell Stock II
 * Medium
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of 
 * the stock at any time. However, you can buy it then immediately sell it on the same day.
 * Find and return the maximum profit you can achieve.
 */
public class BestTimeToBuySellStockTwo {

	public static void main(String[] args) {
		/*
		 * Смысл решения очень прост, нам нужно всегда быть в плюсе, не важно то, каких моментов мы дожидаемся,
		 * Самое важное - это продать с выгодой мгновенно, предположим такой массив {1,2,3}
		 * Да, мы можем купить акции за 1 и продать потом за 3, но прибыль будет такой же, если мы возьмём за 1 - продадим 
		 * сразу за 2, потом возьмём за 2 и на след день продадим за три, 3-1 = (2-1) + (3-2)
		 * также надо помнить, что более выгодная стратегия может быть и существует, но в данной задаче есть ограничение:
		 * "Нельзя держать больше одной акции на руках.". Если в массиве {1,1,2} мы видим одинаковые значения, 
		 * то алгоритм легко их обходит, просто прибавляя к maxProfit ноль, и переходит на следующую итерацию
		 * 
		 * В своём решении я просто прошёлся по всему списку цен, сделал цикл на prices.length-1 итераций и 
		 * проверял пары элементов, встающие у меня на пути, если цена продажи оказывалась выше цены покупки, то я не раздумывая 
		 * продавал акции и добавлял выручку (sell - buy) в итоговую переменную maxProfit
		 */
		int[] prices = {7,1,5,3,6,4};
		int maxProfit = 0;
		int buy = 0;
		int sell = 0;
		
		for (int i = 0; i < prices.length-1; i++) {
			buy = prices[i];
			sell = prices[i+1];
			if (buy <= sell) {
				maxProfit += (sell - buy);
			} 
		}
		System.out.println(maxProfit);

	}

}

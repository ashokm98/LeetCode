package LeetCodeAlgo;

public class BestTimeToSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7,1,5,3,6,4};
		int output = maxProfit(prices);
		
		System.out.println(output);

	}
	
	public static int maxProfit(int[] prices)
	{
		if(prices== null || prices.length == 0)
			return 0;
		
		int profit = 0;
		int bPrice = prices[0];
		
		for(int i = 0; i<prices.length; i++)
		{
			if(prices[i] <= bPrice)
			{
				bPrice = prices[i];
				continue;
			}
				
			profit = Math.max(profit,prices[i] - bPrice);
		}
		 
		return profit;
		
		
	}

}

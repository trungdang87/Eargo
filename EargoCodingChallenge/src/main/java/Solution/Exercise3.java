package Solution;

public class Exercise3 {
	public int[] solution(int[] data) {
		int[] result = new int[2];	//[buy day, sell day]
		
		if(data == null || data.length <= 1) return result; //validate size of data array
		
		int min = data[0];	//when to buy
		int profit = 0;		//profit 
		int sellDay = 0;	//when to sell
		int days = 0;		//# of days between buy day and sell day
		
		for(int i=1; i<data.length; i++) {						//iterate through data array element
			if(min < data[i]) {									
				if((data[i] - min) > profit) {
					sellDay = i;								//keep track of sell day
					days++;										//keep track of # of days between buy day and sell day
					profit = Math.max(profit, data[i] - min);	//calculate max profit
				}
			}
			else {
				min = data[i];									//keep track of buy day
			}
		}
		if(profit > 0) {
			result[1] = sellDay + 1;		//sell day + 1, because data array is 0 base
			result[0] = sellDay - days + 1; //buy day
		}
		return result;
	}
}

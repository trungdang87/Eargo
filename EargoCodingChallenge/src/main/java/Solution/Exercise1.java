package Solution;

import java.util.Arrays;

public class Exercise1 {

	public int[] solution(int num) {
		int[] coins = new int[4];	//[#Quarters, #dimes, #nickels, #pennies]
		while(num > 0) {			//input number can't be 0 or vegative
			while(num >= 25) {		//check for #quarters
				num -=25;
				++coins[0];
			}
			while(num >= 10) {		//check for #dimes
				num -= 10;
				++coins[1];
			}
			while(num >= 5) {		//check for #nickels
				num -= 5;
				++coins[2];
			}
			while(num >= 1) {		//check for #pennies
				--num;
				++coins[3];
			}
		}
		return coins;
	}
	
}

package ksh.firststep;

public class andoperat {

	public static void main(String arg[]) {
		int result = 1 + 2;
		System.out.println("1 + 2 =" + result);
		int previousResult = result;
		System.out.println("previousResult =" + previousResult);
		result = result - 1;
		System.out.println("3 - 1 = "+ result);
		System.out.println("previousResult =" + previousResult);
		
		result = result * 10;
		System.out.println("2 * 10 =" + result);
		
		result = result / 5;
		System.out.println("20 / 5 = " + result);
		
		result = result % 3;
		System.out.println("4 % 3 = " + result);
		
		result++;
		System.out.println("1 + 1 = " + result);

		result--;
		System.out.println("2 - 1 = " + result);
	
		result += 2;
		System.out.println("1 + 2 = " + result);

		result *= 10;
		System.out.println("3 * 10 = " + result);

		result /= 3;
		System.out.println("30 / 3 =" + result);
		
		result -= 2;
		System.out.println("10 - 2 = " + result);

		boolean isAlien = false;
		if (isAlien == true)
			System.out.println("it is not an alien!");
			System.out.println("And I am scared of aliens");

			int topscore =80;
			if (topscore < 100){
					System.out.println("you got the high score!");
					
			}

			int secondTopscore = 81;
			if (topscore > secondTopscore && topscore < 100){
					System.out.println("Greater then second top score and less than 100");	
				}
		}
		
}

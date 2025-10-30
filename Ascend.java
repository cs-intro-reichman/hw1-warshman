// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		double limit = Double.parseDouble(args[0]);
		double multiplyer1 = Math.random();
		double multiplyer2 = Math.random();
		double multiplyer3 = Math.random();

		int num1 = (int) Math.round(multiplyer1 * limit);
		int num2= (int) Math.round(multiplyer2 * limit);
		int num3 = (int) Math.round(multiplyer3 * limit);
		System.out.println(num1 + " " + num2 + " " + num3);
		
		int min = Math.min(Math.min(num1, num2), num3);
		int max = Math.max(Math.max(num1, num2), num3);
		int med = num1 + num2 + num3 - max - min;

		System.out.println(min + " " + med + " " + max);
	}
}

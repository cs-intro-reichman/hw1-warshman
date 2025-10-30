// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int deposit = Integer.parseInt(args[0]);
		double percent = (double) Integer.parseInt(args[1]) / 100.0;
		int years = Integer.parseInt(args[2]);
		double yield = deposit;

		for (int i=0; i<years; i++) {
			yield = yield + (yield * percent);
		}

		int f = (int) yield;

		System.out.println("After " + years +" years, $" + deposit + " saved at " + (percent * 100) + "% will yield $" + f);
	}
}
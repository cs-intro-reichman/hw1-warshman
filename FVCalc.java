// Overall good, very clean

// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int deposit = Integer.parseInt(args[0]);
		double percent = Double.parseDouble(args[1]) / 100.0;
		int years = Integer.parseInt(args[2]);
		double yield = (double) deposit;

		for (int i = 0; i < years; i++) {
			yield = yield + (yield * percent);
		}

		int yieldInt = (int) yield; //yieldAsInt would be a more correct way to name it

		System.out.println("After " + years +" years, $" + deposit + " saved at " + (percent * 100) + "% will yield $" + yieldInt);
	}
}

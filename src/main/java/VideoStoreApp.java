
public class VideoStoreApp {

	public static void main(String[] args) {

		RentalCalculator calculator = new RentalCalculator();
		
		calculateRegularFees(calculator);
		
		calculateChildrensFees(calculator);

		calculateNewReleaseFees(calculator);		
	}

	private static void calculateRegularFees(RentalCalculator calculator) {
		Movie regular = new Movie("WCCI", "regular");
		printAmountDue(calculator, regular, 2);
		printAmountDue(calculator, regular, 3);
		printAmountDue(calculator, regular, 5);
	}

	private static void calculateChildrensFees(RentalCalculator calculator) {
		Movie childrens = new Movie("Up", "childrens");
		printAmountDue(calculator, childrens, 3);
		printAmountDue(calculator, childrens, 4);
		printAmountDue(calculator, childrens, 5);
	}

	private static void calculateNewReleaseFees(RentalCalculator calculator) {
		Movie newRelease = new Movie("Dr Strange", "new release");
		printAmountDue(calculator, newRelease, 1);
		printAmountDue(calculator, newRelease, 5);
	}

	private static void printAmountDue(RentalCalculator calculator, Movie movie, int days) {
		String message = String.format("amount due for a %s movie for %s days = %s", movie.getPriceCode(), days, calculator.calculate(movie, days));
		System.out.println(message);
	}

}

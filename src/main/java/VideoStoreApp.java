import java.math.BigDecimal;

public class VideoStoreApp {

	public static void main(String[] args) {
		
		RentalCalculator calculator = new RentalCalculator();
		
		calculateRegularFees(calculator);
		
		calculateChildrensFees(calculator);

		calculateNewReleaseFees(calculator);		
	}

	private static void calculateRegularFees(RentalCalculator calculator) {
		Movie regular = new RegularMovie("WCCI");
		printAmountDue(calculator, regular, 2);
		printAmountDue(calculator, regular, 3);
		printAmountDue(calculator, regular, 5);
	}

	private static void calculateChildrensFees(RentalCalculator calculator) {
		Movie childrens = new ChildrensMovie("Up");
		printAmountDue(calculator, childrens, 3);
		printAmountDue(calculator, childrens, 4);
		printAmountDue(calculator, childrens, 5);
	}

	private static void calculateNewReleaseFees(RentalCalculator calculator) {
		Movie newRelease = new NewRelease("Dr Strange");
		printAmountDue(calculator, newRelease, 1);
		printAmountDue(calculator, newRelease, 5);
	}

	private static void printAmountDue(RentalCalculator calculator, Movie movie, int days) {
		BigDecimal fees = calculator.calculate(movie, days);
		String message = String.format("amount due for a %s movie for %s days = %s", movie.getPriceCode(), days, fees);
		System.out.println(message);
	}

}

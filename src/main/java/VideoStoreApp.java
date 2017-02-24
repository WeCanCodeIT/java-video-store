
public class VideoStoreApp {

	public static void main(String[] args) {

		RentalCalculator calculator = new RentalCalculator();
		Movie regular = new Movie("WCCI", "regular");
		Movie childrens = new Movie("Up", "childrens");
		Movie newRelease = new Movie("Dr Strnage", "new release");
		
		Movie movie = regular;
		int days = 2;
		printAmountDue(calculator, movie, days);
		int a = 3;
		printAmountDue(calculator, movie, a);
		int b = 5;
		printAmountDue(calculator, movie, b);
		
		Movie foo = childrens;
		int c = 3;
		printAmountDue(calculator, foo, c);
		int d = 4;
		printAmountDue(calculator, foo, d);
		int e = 5;
		printAmountDue(calculator, foo, e);

		Movie bar = newRelease;
		int f = 1;
		printAmountDue(calculator, bar, f);
		int g = 5;
		printAmountDue(calculator, bar, g);

		
	}

	private static void printAmountDue(RentalCalculator calculator, Movie movie, int days) {
		String message = String.format("amount due for a %s movie for %s days = %s", movie.getPriceCode(), days, calculator.calculate(movie, days));
		System.out.println(message);
	}

}

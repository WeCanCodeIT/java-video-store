import java.math.BigDecimal;

public class RentalCalculator {

	public BigDecimal calculate(Movie movie, int days) {

		return movie.calculateFees(days);

	}

}

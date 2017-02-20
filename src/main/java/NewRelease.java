import java.math.BigDecimal;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title, "new release");
	}


	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal fees = new BigDecimal("3.00");
		BigDecimal numOfDays = new BigDecimal(days);
		
		fees = fees.multiply(numOfDays);

		return fees;
	}

}

import java.math.BigDecimal;

public class NewReleaseFeeCalculator implements FeeCalculator {

	public BigDecimal calculateFees(int days) {
		BigDecimal rentalDays = new BigDecimal(days);
		return new BigDecimal("3.00").multiply(rentalDays);
	}

}

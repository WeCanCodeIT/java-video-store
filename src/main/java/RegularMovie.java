import java.math.BigDecimal;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title, "regular");
	}

	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal fees = new BigDecimal("2.00");
		if (days > 2) {
			BigDecimal extraDays = new BigDecimal(days - 2);
			BigDecimal extaFees = new BigDecimal("1.50");
			fees = fees.add((extaFees).multiply(extraDays));
		}
		
		
		return fees;
	}

}

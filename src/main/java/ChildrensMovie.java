import java.math.BigDecimal;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title) {
		super(title, "Childrens");
	}


	@Override
	public BigDecimal calculateFees(int days) {
		
		BigDecimal fees = new BigDecimal("1.50");
		if (days > 3) {
			BigDecimal extraDays = new BigDecimal(days - 3);
			BigDecimal extaFees = new BigDecimal("1.50");
			fees = fees.add((extaFees).multiply(extraDays));
		}
		return fees;
	}

}

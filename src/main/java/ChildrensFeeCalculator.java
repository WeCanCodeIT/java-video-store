import java.math.BigDecimal;

public class ChildrensFeeCalculator implements FeeCalculator {

	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal amount;
		amount = new BigDecimal("1.50");
		if (days > 3) {
			BigDecimal extraDays = new BigDecimal(days - 3);
			amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
		}
		return amount;
	}

}

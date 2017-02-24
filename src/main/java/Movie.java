import java.math.BigDecimal;

public abstract class Movie {

	private String title;
	private String priceCode;
	
	protected BigDecimal feePerDay;
	
	private int baseDays;
	private BigDecimal baseFee;

	public Movie(String title, String priceCode, BigDecimal feePerDay, int baseDays, BigDecimal baseFee) {
		this.title = title;
		this.priceCode = priceCode;
		this.feePerDay = feePerDay;
		this.baseDays = baseDays;
		this.baseFee = baseFee;
	}

	public String getTitle() {
		return title;
	}

	public String getPriceCode() {
		return priceCode;
	}

	public BigDecimal calculateFees(int days) {
		if (days > baseDays) {
			BigDecimal extraDays = new BigDecimal(days - baseDays);
			return baseFee.add(feePerDay.multiply(extraDays));
		}
		
		return baseFee;
	}
}

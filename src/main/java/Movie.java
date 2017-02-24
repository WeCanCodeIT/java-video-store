import java.math.BigDecimal;

public class Movie {

	private String title;
	private String priceCode;
	private FeeCalculator feeCalculator;

	public Movie(String title, String priceCode, FeeCalculator feeCalculator) {
		this.title = title;
		this.priceCode = priceCode;
		this.feeCalculator = feeCalculator;
	}

	public String getTitle() {
		return title;
	}

	public String getPriceCode() {
		return priceCode;
	}

	public BigDecimal calculateFees(int days) {
		return feeCalculator.calculateFees(days);
	}
}

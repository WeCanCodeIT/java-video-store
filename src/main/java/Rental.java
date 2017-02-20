import java.math.BigDecimal;

public class Rental {
	
	Movie rented;
	int days;
	
	public Rental (Movie rented, int days) {
		this.rented = rented;
		this.days = days;
	}
	
	public BigDecimal calculateFees() {
		BigDecimal fee = rented.calculateFees(days);
		return fee;
	}
	
	public String getTitle() {
		return rented.title;
	}
	
	public String getPriceCode() {
		return rented.priceCode;
	}

}

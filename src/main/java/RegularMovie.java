import java.math.BigDecimal;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title, "regular", new BigDecimal("1.50"), 2, new BigDecimal("2.00"));
	}

}

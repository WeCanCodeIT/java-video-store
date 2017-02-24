import static java.math.BigDecimal.ZERO;

import java.math.BigDecimal;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title, "new release", new BigDecimal("3.00"), 0, ZERO);
	}

}

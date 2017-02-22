import java.math.BigDecimal;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class BigDecimalStringMatcher extends TypeSafeMatcher<BigDecimal> {

	private BigDecimal expected;

	public BigDecimalStringMatcher(String expected) {
		this.expected = new BigDecimal(expected);
	}

	@Override
	public void describeTo(Description description) {
		description.appendText("a BigDecimal with the value ").appendValue(expected);
	}

	@Override
	protected boolean matchesSafely(BigDecimal actual) {
		return actual.equals(expected);
	}

}

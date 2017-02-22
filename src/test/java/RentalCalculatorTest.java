import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Assert;
import org.junit.Test;

public class RentalCalculatorTest {

	@Test
	public void shoulCalculateFeeForRegularForOneDay() {
		
		//arrange
		RentalCalculator underTest = new RentalCalculator();
		Movie regular = new Movie("Some Title", "regular");
		
		//act
		BigDecimal fee = underTest.calculate(regular, 1);
		
		//assert
		Assert.assertEquals(new BigDecimal("2.00"), fee); 
		// is the same as...
		// using a static import...
		assertEquals(new BigDecimal("2.00"), fee);
		// my preferred way
		assertThat(fee, Matchers.is(new BigDecimal("2.00")));
		// with static imports
		assertThat(fee, is(new BigDecimal("2.00")));
		// but what I really want to say is...
		assertThat(fee, isBigDecimalOf("2.00"));
	}

	private Matcher<BigDecimal> isBigDecimalOf(String expected) {
		return new BigDecimalStringMatcher(expected);
	}
	
	// or maybe if I was only using it here, I'd create an anonymous class
	private Matcher<BigDecimal> isBigDecimalOfAsAnonymous(String expected) {
		return new TypeSafeMatcher<BigDecimal>() {
			@Override
			public void describeTo(Description description) {
				description.appendText("a BigDecimal with the value ").appendValue(expected);
			}
			@Override
			protected boolean matchesSafely(BigDecimal actual) {
				return actual.equals(expected);
			}
		};
	}
}

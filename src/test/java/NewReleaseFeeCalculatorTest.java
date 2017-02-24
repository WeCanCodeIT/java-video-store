import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class NewReleaseFeeCalculatorTest {

	@Test
	public void shouldCalculateForOneDay() {
		FeeCalculator underTest = new NewReleaseFeeCalculator();
		
		BigDecimal fee = underTest.calculateFees(1);
		
		assertThat(fee, is(new BigDecimal("3.00")));
	}
	
	@Test
	public void shouldCalculateForFiveDays() {
		FeeCalculator underTest = new NewReleaseFeeCalculator();
		
		BigDecimal fee = underTest.calculateFees(5);
		
		assertThat(fee, is(new BigDecimal("15.00")));	
	}
}

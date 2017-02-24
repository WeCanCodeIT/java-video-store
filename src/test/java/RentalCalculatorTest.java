import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class RentalCalculatorTest {
	
	private RentalCalculator underTest;
	
	@Before
	public void setup() {
		underTest = new RentalCalculator();
	}
	
	@Test
	public void shoudCalculateFeeForRegularMovieFor2Days() {
		
		BigDecimal fees = calculateRegularMovieFeesFor(2);
		
		assertThat(fees, is(bigDecimalOf("2.00")));
	}

	@Test
	public void shoudCalculateFeeForRegularMovieFor3Days() {
		
		BigDecimal fees = calculateRegularMovieFeesFor(3);
		
		assertThat(fees, is(bigDecimalOf("3.50")));
	}
	
	@Test
	public void shoudCalculateFeeForRegularMovieFor5Days() {
		
		BigDecimal fees = calculateRegularMovieFeesFor(5);
		
		assertThat(fees, is(bigDecimalOf("6.50")));
	}
	
	private BigDecimal calculateRegularMovieFeesFor(int days) {
		Movie regularMovie = new Movie("regular release", "regular");
		return underTest.calculate(regularMovie, days);
	}

	private BigDecimal bigDecimalOf(String expected) {
		return new BigDecimal(expected);
	}
	
	@Test
	public void shouldCalculateFeesForChildrensMovieFor3Days() {
		BigDecimal fees = calculateChildrensMovieFeesFor(3);
		
		assertThat(fees, is(bigDecimalOf("1.50")));
	}

	@Test
	public void shouldCalculateFeesForChildrensMovieFor4Days() {
		BigDecimal fees = calculateChildrensMovieFeesFor(4);
		
		assertThat(fees, is(bigDecimalOf("3.00")));
	}
	
	@Test
	public void shouldCalculateFeesForChildrensMovieFor5Days() {
		BigDecimal fees = calculateChildrensMovieFeesFor(5);
		
		assertThat(fees, is(bigDecimalOf("4.50")));
	}
	
	private BigDecimal calculateChildrensMovieFeesFor(int days) {
		Movie childrensMovie = new Movie("children's movie", "childrens");
		return underTest.calculate(childrensMovie, days);
	}

	@Test
	public void shouldCalculateFeesForNewReleaseFor1Day() {
		BigDecimal fees = calculateNewReleaseFeesFor(1);
		
		assertThat(fees, is(bigDecimalOf("3.00")));
	}
	

	@Test
	public void shouldCalculateFeesForNewReleaseFor5Days() {
		BigDecimal fees = calculateNewReleaseFeesFor(5);
		
		assertThat(fees, is(bigDecimalOf("15.00")));
	}
	
	private BigDecimal calculateNewReleaseFeesFor(int days) {
		Movie newRelease = new Movie("new release", "newRelease");
		return underTest.calculate(newRelease, days);
	}

}

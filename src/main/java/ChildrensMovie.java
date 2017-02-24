import java.math.BigDecimal;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title) {
		super(title, "childrens", new BigDecimal("1.50"), 3, new BigDecimal("1.50"));
	}

}

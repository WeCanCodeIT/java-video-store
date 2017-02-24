
public class MovieFactory {

	public static Movie createRegularMovie(String title) {
		return new Movie(title, "regular", new RegularFeeCalculator());
	}

	public static Movie createChildrensMovie(String title) {
		return new Movie(title, "childrens", new ChildrensFeeCalculator());
	}

	public static Movie createNewRelease(String title) {
		return new Movie(title, "new release", new NewReleaseFeeCalculator());
	}

}

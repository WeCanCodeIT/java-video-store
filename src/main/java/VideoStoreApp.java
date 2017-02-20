import java.io.IOException;
import java.util.Scanner;

public class VideoStoreApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		RentalStatement statement = new RentalStatement();
		
		System.out.println("Welcome to Video Store App.");
		System.out.println("Would you like to see a list of movies you have in your Collection?"
				+ "\nPlease enter\n \t1 - Yes\n\t2 - No");
		int userChoice = scanner.nextInt();
		
		if (userChoice == 1) {
			
			//This will read from text file and print to console.
			try {
				statement.readFromText();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		
		System.out.println("Well now choose for how many days would you like to rent movies?");
		int days = scanner.nextInt();
				
				
		
		
		Movie regular = new RegularMovie("WCCI");
		Movie childrens = new ChildrensMovie("Up");
		Movie newRelease = new NewRelease("Dr Strange");
		
		Rental regualarMovie = new Rental(regular, days);
		Rental childrensMovie = new Rental(childrens, days);
		Rental newReleaseMovie = new Rental(newRelease, days);
		
		statement.add(regualarMovie);
		statement.add(childrensMovie);
		statement.add(newReleaseMovie);

		System.out.println("Here is your New list and fees for " + days + "days");
		statement.print();
		
		System.out.println("would you like to update this list to your Collection?"
				+ "\nPlease enter\n \t1 - Yes\n\t2 - No");
		userChoice = scanner.nextInt();
		
		if (userChoice == 1) {
			
			//this will print to the text file called videoRecords.txt
			try {
				statement.printToText();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n\nYou have updated your List, Thank you.");
			
		}else System.out.println("Thank you and have a good day");
		
		scanner.close();
		
		
	}

}

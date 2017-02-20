import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {
	Collection<Rental> rentals = new ArrayList<Rental>();
	
	public void add(Rental toAdd) {
		rentals.add(toAdd);
	}
	
	public void print() {
		for (Rental rental : rentals) {
			System.out.println("\nprice code: " + rental.getPriceCode() +
					 "\nTitle - " + rental.getTitle() + "\nFees - $" + rental.calculateFees() + "\n");
		}
		
	}
	
	public void printToText() throws Exception {
		
		FileOutputStream fileOutput = new FileOutputStream("VideoRecords.txt");
		PrintStream printOutput = new PrintStream(fileOutput);
		
		for (Rental rental : rentals) {
			
			printOutput.println("\nprice code: " + rental.getPriceCode() +
					 "\nTitle - " + rental.getTitle() + "\nFees - $" + rental.calculateFees() + "\n");
			
		}
		
		fileOutput.close();
		printOutput.close();
		
	}
	
	public void readFromText() throws IOException {
		FileReader fileIn = new FileReader("VideoRecords.txt");
		BufferedReader reader = new BufferedReader(fileIn);
		
		System.out.println("***************************************"
				+ "\n\nThis is a Collection of Rented Movies we had on a text file\n");
		
		String line;
		 while((line = reader.readLine()) != null) {
			 System.out.println(line);
		 }
		 
		 System.out.println("***************************************\n\n\n");
		 
		 reader.close();
	}


}

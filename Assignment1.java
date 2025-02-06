import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
	public static void main(String[] args) {
		double temp;
		double celsius;
		String result = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("NNN       NNN  MMM           MMM");
		System.out.println("NNNN      NNN  MMMM         MMMM");
		System.out.println("NNNNN     NNN  MMMMM       MMMMM");
		System.out.println("NNN NNN   NNN  MMM MM     MM MMM");
		System.out.println("NNN NNNN  NNN  MMM  MM   MM  MMM");
		System.out.println("NNN  NNNN NNN  MMM  MMMMMMM  MMM");
		System.out.println("NNN   NNN NNN  MMM    MMM    MMM");
		System.out.println("");
		System.out.println("Please enter a number in Fahrenheit:");
		temp = scan.nextDouble();
		celsius = ((temp - 32) * 5/9);
		scan.nextLine();
		System.out.println("");
		System.out.println("Please enter a 5-character string:");
		String fivechar = scan.nextLine();
		if (fivechar.length() == 5) {
			result = "" + fivechar.charAt(3) + fivechar.charAt(2) + fivechar.charAt(1);
		}
		System.out.println("");
		System.out.println("Generating random number. Continuing");
		System.out.println("");
		Random generator = new Random();
		int randomnum = generator.nextInt(Integer.MAX_VALUE);
		System.out.println("Your new string is " + celsius + result + randomnum);
		scan.close();
	}
}

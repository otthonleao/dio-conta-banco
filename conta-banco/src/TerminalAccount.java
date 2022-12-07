import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
	public static void main(String[] args) throws Exception {
		System.out.println("\n============================================");
		System.out.println("===              BANK ACCOUNT            ===");
		System.out.println("============================================\n");

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("What's the first name: ");
		String firstName = scanner.next();
		System.out.println("\nWhat's the last name: ");
		String lastName = scanner.next();
		System.out.println("\nPlease, type agency number:");
		String agency = scanner.next();
		System.out.println("\nNow, type the account number: ");
		int accountNumber = scanner.nextInt();
		System.out.println("\nInsert the first deposit:");
		double funds = scanner.nextDouble();

		System.out.println("\nLoading...");
		System.out.println("Loading...");
		System.out.println("Loading...");
		System.out.println("Loading...");
		System.out.println("DONE!!!");

		System.out.println("\nHi, " + firstName + " " + lastName + ", thank you for open your account with our bank, your agency is " + agency + ", account number is " + accountNumber + " and your funds is available for withdraw");	
	}
}

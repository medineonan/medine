import java.util.Scanner;

public class ReviewWithElion {

	public static void main(String[] args) {
		System.out.println("Are you a boy or  a girl?");
		Scanner med = new Scanner(System.in);
		String gender = med.nextLine();
		System.out.println("Are  you rich?");
		boolean rich = med.hasNextBoolean();

		if (gender.equals("Boy")) {
			System.out.println("Yaaaaaaay");
			if (rich) {
				System.out.println("Buy a ferrari");
			} else {
				System.out.println("Play soccer");
			}

		} else if (gender.equals("Girl")) {

			System.out.println("Yay");
			if (rich) {
				System.out.println("Buy Vakko");
			} else {
				System.out.println("Read a book");
			}

		} else {
			System.out.println("Unknown gender");
		}

	}
}

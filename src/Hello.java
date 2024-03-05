import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {

		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 2 - y; x++) {
				System.out.print(" ");
			}
			for (int x = 0; x < 2 * y + 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int y = 1; y <= 2; y++) {
			for (int x = 0; x < y; x++) {
				System.out.print(" ");
			}
			for (int x = 0; x < -2 * y + 5; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

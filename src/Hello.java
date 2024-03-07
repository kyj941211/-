import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		String answer;
		
		do {
			int num1 = Hello.inputNum1();
			char result = Hello.inputOp();
			int num2 = Hello.inputNum2();
			answer = Hello.Output(num1, result, num2);

		} while (answer.equals("y") || answer.equals("Y")); // 문자열은 값을 비교해야하니 equals
	}

	public static String Output(int num1, char result, int num2) {
		if (result == '+') {
			System.out.println(Hello.add(num1, num2));
		} else if (result == '-') {
			System.out.println(Hello.minus(num1, num2));
		} else if (result == '*') {
			System.out.println(Hello.multiply(num1, num2));
		} else if (result == '/') {
			System.out.println(Hello.divide(num1, num2));
		} else {
			System.out.println("잘못된 입력");
		}
		System.out.print("계속 하시겠습니까?(y/Y)>");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public static int inputNum1() {
		System.out.print("숫자를 입력하세요:");
		Scanner sc = new Scanner(System.in); // do는 입력기능 위에 작성
		return sc.nextInt();
	}

	public static int inputNum2() {
		System.out.print("숫자를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static char inputOp() {
		System.out.print("연산자를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		return sc.next().charAt(0);

	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public static double divide(int num1, int num2) {
		return (double) num1 / (double) num2;
	}
}

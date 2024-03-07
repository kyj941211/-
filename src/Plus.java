import java.util.Scanner;

public class Plus {
	// field(변수선언)
	private int a; // 외부에서 못쓰게 하기 위해서 private
	private int b;
	private char ch;
	private double result;
	private char ans;

	// c 객체 생성할때 이 값으로 사용할거에요. 0으로 시작할꺼면 디폴트생성자 사용하면 됨. 어떤 값으로 시작할꺼면 생성자 필요.
	// 두가지 다 만족시켜야 되니까 생성자를 오버로딩하는 거지.
	public Plus() {

	}

	public Plus(int aa, char c, int bb) {
		a = aa;
		ch = c;
		b = bb;

	}

	// m
	public void setA(int num1) {
		a = num1;
	}

	public void setCh(char num2) {
		ch = num2;
	}

	public void setB(int num3) {
		b = num3;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public char getCh() {
		return ch;
	}

	public int add(int aa, int bb) {
		return aa + bb;
	}

	public int minus(int aa, int bb) {
		return aa - bb;
	}

	public int multiply(int aa, int bb) {
		return aa * bb;
	}

	public double divide(int aa, int bb) {
		return (double)aa / bb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요:");
		int a = sc.nextInt();
		System.out.print("연산자를 입력하세요:");
		char ch = sc.next().charAt(0);
		System.out.print("숫자를 입력하세요:");
		int b = sc.nextInt();

		Plus plus = new Plus(a, ch, b);

		System.out.println(plus.getA() + "" + plus.getCh() + "" + plus.getB() + "=");

		switch (ch) {
		case '+':
			System.out.println(plus.add(a, b));
			break;
		case '-':
			System.out.println(plus.minus(a, b));
			break;
		case '*':
			System.out.println(plus.multiply(a, b));
			break;
		case '/':
			System.out.println(plus.divide(a,b));
			break;
		default:
			System.out.println("잘못된 입력");
//
		}
	}
}

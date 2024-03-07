import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

		String[] name = new String[3]; // 이름
		int score[][] = new int[3][4]; // 국,영,수,총
		float[] avg = new float[3]; // 평균

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < name.length; i++) {
			System.out.print("이름을 입력하세요");
			name[i] = sc.next();

			System.out.print("국어점수를 입력하세요");
			score[i][0] = sc.nextInt();
			System.out.print("영어점수를 입력하세요");
			score[i][1] = sc.nextInt();
			System.out.print("수학점수를 입력하세요");
			score[i][2] = sc.nextInt();
			
			for(int j=0;j<3;j++) {
				score[i][3] += score[i][j];
			}
			avg[i] = score[i][3] / 3.f;
		}

		for (int i = 0; i < 3; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "\t");
			}

			System.out.println(avg[i]);
		}
	}
}

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇명입니까?");
		int people = sc.nextInt();
		
		String[] name = new String[people]; // 이름
		int score[][] = new int[people][4]; // 국,영,수,총
		float[] avg = new float[people]; // 평균



		for (int i = 0; i < people; i++) {
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

		for (int i = 0; i <people ; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < 4; j++) { 
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(avg[i]);
		}
	}
}

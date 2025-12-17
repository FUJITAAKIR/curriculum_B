package curriculum_B;

public class Question11 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点）
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//				System.out.print("0");
//				System.out.print(i);
				System.out.printf("%02d", i);//二桁の数字で表示				System.out.print("*");
//				System.out.print("0");
				System.out.printf("%02d", j);
				System.out.print("=");
				System.out.printf("%02d", i * j);
				System.out.print("||");
				if (j == 9) {
					System.out.println();
				}
			}
		}

	}

}
//問題11
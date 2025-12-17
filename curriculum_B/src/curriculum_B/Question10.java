package curriculum_B;

import java.util.Scanner;//スキャナークラス

public class Question10 {

	public static void main(String[] args) { // メインメソッド（プログラムの開始地点）
		Scanner sc = new Scanner(System.in);
		int nyuuryoku;
		do {
			// 最低1回は実行される処理
			System.out.println("数値を入力してください");
			nyuuryoku = sc.nextInt();

		} while (nyuuryoku != 0);
		System.out.println("終了しました" + nyuuryoku + "です");
		sc.close();// スキャナークラスの終了宣言

	}
}
//Q10の問題
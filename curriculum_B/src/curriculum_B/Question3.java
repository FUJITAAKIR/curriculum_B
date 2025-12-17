package curriculum_B;

import java.util.Scanner;//スキャナークラス

public class Question3 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点）
		Scanner sc = new Scanner(System.in);
		int count = 0;//カウンター変数の初期化
		int sum;//変数sumの宣言
		do {
			//最低1回は実行される処理
			System.out.println("数値を入力してください");
			sum = sc.nextInt();
			if (sum >= 1 && sum <= 100) {
				count += sum;
			}
		} while (sum != 0);
		System.out.println("終了しました");
		System.out.println("1~100の合計は" + count + "です");
		sc.close();//スキャナークラスの終了宣言

	}
}
//Q9の問題
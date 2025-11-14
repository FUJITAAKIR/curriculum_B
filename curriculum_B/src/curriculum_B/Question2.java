package curriculum_B;

import java.util.Scanner; //Scannerクラスを使うために必要

public class Question2 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点）

		Scanner sc = new Scanner(System.in);
		System.out.println("1~7を入力してください");
		int day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("入力は無効です");

		}
		sc.close();// 終了の宣言
	}

}

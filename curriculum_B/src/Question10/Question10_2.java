package Question10;

import java.util.Scanner; //Scannerクラスを使うために必要

public class Question10_2 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点）

		Scanner sc = new Scanner(System.in);
		System.out.println("1~12を入力してください");
		int month = sc.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		
		default:
			System.out.println("入力は無効です");

		}
		sc.close();// 終了の宣言
	}

}





package curriculum_B;

import java.util.Scanner;

public class Question46 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点
		int[] numbers = { 4, 7, 10, 15, 20 };
		Scanner sc = new Scanner(System.in);

		System.out.print("数値を入力してください:");
		int input = sc.nextInt();
		boolean found = false;
		for (int i : numbers) {
			if (i == input) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(input + "は配列に含まれています");
		} else {
			System.out.println(input + "は配列に含まれていません");
		}
		sc.close();

	}

}
//Question6 配列

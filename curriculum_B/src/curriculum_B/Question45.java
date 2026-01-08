package curriculum_B;

public class Question45 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点
		int[] numbers = { 1, 2, 3, 4, 5 };
		// 配列の要素を2倍にする
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] *= 2;
		}
		//結果表示
		for (int j : numbers) {
			System.out.println(j);
		}
	}

}
//Question5 配列
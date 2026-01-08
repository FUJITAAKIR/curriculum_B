package curriculum_B;

public class Question48 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点
		int[][] array = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println("合計値:" + sum);
	}
}
//Question8 配列
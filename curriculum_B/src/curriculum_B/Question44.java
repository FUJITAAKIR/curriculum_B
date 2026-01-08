package curriculum_B;

public class Question44 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点
		int numbers[] = { 12, 7, 9, 21, 5, 18 };
		int max = numbers[0];
		int min = numbers[0];

		for (int i : numbers) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}

		}
		System.out.println("最大値:" + max);
		System.out.println("最小値:" + min);

	}

}
//Question4 配列
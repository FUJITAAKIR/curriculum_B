package curriculum_B;

import java.util.Scanner;//コンソール入力クラス
import java.util.Random;//乱数宣言クラス

public class Question12 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点）
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ[商品名を[,]区切りで入力してください");
		String input = sc.nextLine();
		String[] items = input.split(",");

		int tvStock = rand.nextInt(12);//１～１２のランダムな数字を入れる
		for (String item : items) {
			switch (item) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(item + "残りの台数は" + rand.nextInt(12) + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.println(item + "の残りの台数は" + (item.equals("テレビ") ? tvStock : 11 - tvStock) + "台です");
				break;
			default:
				System.out.println("[" + item + "]は指定の商品ではありません");
			}
		}
		sc.close();
	}
}
//問題12
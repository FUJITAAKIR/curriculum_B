package curriculum_B;

public class Question49 {
	public static void main(String[] args) { // メインメソッド（プログラムの開始地点
		int [][]array= {
				{12,15,8},
				{6,19,25},
				{30,2,10}
		};
	int max=array[0][0];
	int min=array[0][0];
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array[i].length;j++) {
			if(array[i][j]>max) {
				max=array[i][j];
			}
			if(array[i][j]<min) {
				min=array[i][j];
			}
		}
	}
	System.out.println("最大値:"+max);
	System.out.println("最小値"+min);
	}

}
//question9 配列
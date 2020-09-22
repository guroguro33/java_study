package jp.learning.javastudy;

public class Practice4 {

	public static void main(String[] args) {
		// 練習４−１
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
		// 練習４−２
		int[] moneyList = {121902, 8302, 55100};
		
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		for(int list: moneyList) {
			System.out.println(list);
		}
		
		// 練習４−４
		int[] numbers = {3, 4, 9};
		
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for(int i = 0; i < numbers.length; i++) {
			if(input == numbers[i]) {
				System.out.println("アタリ！");
				break;
			}
		}
		System.out.println("ハズレ…");
	}

}

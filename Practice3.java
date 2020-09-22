package jp.learning.javastudy;

public class Practice3 {

	public static void main(String[] args) {
		// 問題３−１　①
		int weight = 60;
		if(weight == 60) {
			System.out.println("60に等しい");
		}
		// ②
		int age1 = 20;
		int age2 = 30;
		if((age1 + age2) * 2 > 60) {
			System.out.println("60を超えている");
		}
		
		// ③
		int age3 = 23212;
		if(age3 % 2 == 0) {
			System.out.println("２の倍数です");
			
		}
		
		// ④
		String name = "湊";
		if(name.equals("湊")) {
			System.out.println("湊と等しい");
		}
		
		//　練習3-3
		int seibetsu = 0;
		int age = 37;
		System.out.println("こんにちは。");
		if(seibetsu == 0) {
			System.out.println("私は男です。");
			System.out.println(age + "歳です。");
		} else {
			System.out.println("私は女です。");
		} 
		System.out.println("よろしくお願いします。");
		
		// 練習3-5
		System.out.println("［メニュー］１：検索　２：登録　３：削除　４：変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
		case 1:
			System.out.println("検索します。");
			break;
		case 2:
			System.out.println("登録します。");
			break;
		case 3:
			System.out.println("削除します。");
			break;
		case 4:
			System.out.println("変更します。");
			break;
		default :
			break;
		}
		
		// 練習3-6
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0; i < 8; i++) {
			System.out.println("0〜9までの数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います。");
			}
		}
		System.out.println("ゲームを終了します");

	}

}

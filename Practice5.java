package jp.learning.javastudy;

public class Practice5 {

	public static void main(String[] args) {
		introduceOneSelf();
		
		email("タイトルです", "email@japan.com", "本文です");
		
		email("address2@gmail.com", "本文です2");
		
		System.out.println("三角形の面積は" + calcTriangleArea(10, 5) + "cm2です"); 
		
		System.out.println("円の面積は" + calcCircleArea(5) + "cm2です"); 
		
	}
	
	public static void introduceOneSelf() {
		String name = "たろう";
		int age = 20;
		double height = 175.5;
		char sex = '男';
		
		System.out.println("こんにちわ。" + name + "といいます。年齢は" + age + "歳で、" + "身長は" + height + "cmで、性別は" + sex + "です。");
		
	}
	
	public static void email(String title, String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました。");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");
		
	}
	
	public static void email(String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：「" + text + "」");
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
	

package jp.learning.javastudy;

import java.util.Random;

public class Cleric2 {
	String name;
	int hp = 50;
	int mp = 10;
	static final int MAX_HP = 50;
	static final int MAX_MP = 10;
	
	public Cleric2(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
//	public Cleric2(String name, int hp) {
//		this.name = name;
//		this.hp = hp;
//		this.mp = Cleric2.MAX_MP;
//	}
	// コンストラクタを使ってコンストラクタを定義
	public Cleric2(String name, int hp) {
		this(name, hp, Cleric2.MAX_MP);
	}
	
//	public Cleric2(String name) {
//		this.name = name;
//		this.hp = Cleric2.MAX_HP;
//		this.mp = Cleric2.MAX_MP;
//	}
	//　更に上記のコンストラクタを使ってコンストラクタを定義
	public Cleric2(String name) {
		this(name, Cleric2.MAX_HP);
	}
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = Cleric2.MAX_HP;
		System.out.println("HPを最大まで回復した！");
	}
	
	public int pray(int count) {
		System.out.println(this.name + "は" + count + "秒間、祈りを捧げた！");
//		Random rand = new Random();
//		int point = rand.nextInt(3); 
//		this.mp = count + point; 
//		if(this.mp > this.MaxMp) {
//			this.mp = this.MaxMp;
//		}
//		System.out.println("MPを回復した");
//		return this.mp;
		
		// 回答例
		// 乱数で回復量を計算
		int recover = new Random().nextInt(3) + count;
		
		// 実際の回復量を乱数を用いて決定する
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		
		this.hp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した。");
		return recoverActual;
	}
}

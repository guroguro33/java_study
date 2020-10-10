package jp.learning.javastudy;

import java.util.Random;

public class Cleric2 {
	String name;
	int hp = 50;
	final int MaxHp = 50;
	int mp = 10;
	final int MaxMp = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MaxHp;
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
		int recoverActual = Math.min(this.MaxMp - this.mp, recover);
		
		this.hp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した。");
		return recoverActual;
	}
}

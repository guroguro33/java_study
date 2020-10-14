package jp.learning.javastudy;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void heal(Hero h) {
		int basePoint = 10; // 基本回復ポイント
		int recoverPoint = (int) (basePoint * this.wand.power); // 杖による増幅
		h.setHp(h.getHp() + recoverPoint); // 勇者のHPを回復させる
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}
	
	
}

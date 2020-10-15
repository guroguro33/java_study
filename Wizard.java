package jp.learning.javastudy;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void heal(Hero h) {
		int basePoint = 10; // 基本回復ポイント
		int recoverPoint = (int) (basePoint * this.getWand().getPower()); // 杖による増幅
		h.setHp(h.getHp() + recoverPoint); // 勇者のHPを回復させる
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public void setName(String name) {
		if(name.length() < 4){
			throw new IllegalArgumentException("エラーメッセージ");
		}
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setWand(Wand wand){
		this.wand = wand;
	}

	public Wand getWand(){
		return this.wand;
	}
	
}

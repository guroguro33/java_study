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
		if(hp < 0){
			this.hp = 0;
		}else{
			this.hp = hp;
		}
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setMp(int mp) {
		if(mp < 0){
			throw new IllegalArgumentException("魔法使いに設定しようとしているmpが異常です");
		}
		this.mp = mp;
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public void setName(String name) {
		if(name == null || name.length() < 3){
			throw new IllegalArgumentException("魔法使いに設定しようとしている名前が異常です");
		}
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setWand(Wand wand){
		if(wand == null){
			throw new IllegalArgumentException("設定されようとしている杖がnullです");
		}
		this.wand = wand;
	}

	public Wand getWand(){
		return this.wand;
	}
	
}

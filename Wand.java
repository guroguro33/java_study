package jp.learning.javastudy;

public class Wand {
	private String name; // 杖の名前
	private double power; // 杖の魔力
	
	public void setName(String name) {
		if(name == null || name.length() < 3){
			throw new IllegalArgumentException("杖に設定しようとしている名前が異常です。");
		}
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPower(double power) {
		if(power < 0.5 && power > 100){
			throw new IllegalArgumentException("杖に設定しようとしている増幅率が異常です");
		}
		this.power = power;
	}
	
	public double getPower() {
		return this.power;
	}
	
}

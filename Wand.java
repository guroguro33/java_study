package jp.learning.javastudy;

public class Wand {
	private String name; // 杖の名前
	private double power; // 杖の魔力
	
	public void setName(String name) {
		if(name.length() < 4){
			throw new IllegalArgumentException("エラーメッセージ");
		}
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPower(double power) {
		this.power = power;
	}
	
	public double getPower() {
		return this.power;
	}
	
}

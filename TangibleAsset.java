package jp.learning.javastudy;

public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;
    // コンストラクタ
    public TangibleAsset(String name, int price, String color){
        super(name, price);
        this.color = color;
    }
    // 抽象メソッド
    public String getColor(){
        return this.color;
    };
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
}

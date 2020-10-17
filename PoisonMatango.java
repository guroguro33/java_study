package jp.learning.javastudy;

public class PoisonMatango extends Matango {

    int attackCount = 5;

    public PoisonMatango(char suffix){
        super(suffix);
    }

    public void attack(Hero h){
        super.attack(h);
        if(this.attackCount > 0){
            System.out.println("さらに毒の胞子をばらまいた！");

            int damage = Math.round(h.getHp() / 5);
            h.setHp(h.getHp() - damage);
            System.out.println(damage + "ポイントのダメージ");

            attackCount --;
        } else {
            System.out.println("これ以上毒攻撃できません");
        }

    }

}

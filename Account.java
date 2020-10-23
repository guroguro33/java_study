package jp.learning.javastudy;
//import java.lang.String;

public class Account {
    String accountNumber;
    int balance;

    // 文字表現のメソッドtoString()をオーバーライドする！
    public String toString(){
        return "¥¥" + balance + "(口座番号＝" + accountNumber + "）";
    }

    // 等価のメソッドequal()をオーバーライドする！
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        // ここから追加
        if(o instanceof Account){
            Account a = (Account) o;
            String an1 = this.accountNumber.trim();
            String an2 = a.accountNumber.trim();
            if(an1.equals(an2)){
                return true;
            }
        }
        return false;
    }
}

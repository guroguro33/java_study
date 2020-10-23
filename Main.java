package jp.learning.javastudy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        // 現在日時
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        System.out.println(now);

        // 取得した日時をカレンダーにセット
        c.setTime(now);

        // カレンダーから日の情報を取得
        int day = c.get(Calendar.DAY_OF_MONTH);

        // 100日追加してカレンダーの日にセット
        c.set(Calendar.DAY_OF_MONTH, day + 100);

        // CalendarをDateに変換
        Date future = c.getTime();

        // インスタンスの中身を表示
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));

        // 14章問題の動作確認
        Account a = new Account();
        a.accountNumber = "4649";
        a.balance = 1592;

        System.out.println(a);

        Account b = new Account();
        b.accountNumber = " 4649";
        b.balance = 20000;

        System.out.println(b.equals(a));

    }
}

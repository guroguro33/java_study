import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws IOException{

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

    // 14章練習問題の動作確認
    Account a = new Account();
    a.accountNumber = "4649";
    a.balance = 1592;

    System.out.println(a);

    Account b = new Account();
    b.accountNumber = " 4649";
    b.balance = 20000;

    System.out.println(b.equals(a));

    // 15章の練習問題
    try{
      String s = null;
      System.out.println(s.length());

    } catch (NullPointerException e) {
      System.out.println("NullPointerException例外をキャッチしました");
      System.out.println("ーースタックトレース（ここから）ーー");
      e.printStackTrace();
      System.out.println("ーースタックトレース（ここまで）ーー");
    }

    // 15-3練習問題
    try {
      String str = "三";
      int i = Integer.parseInt(str);
    } catch(NumberFormatException e) {
      System.out.println("例外NumberFormatExceptionをキャッチしました");
      e.printStackTrace();
    }

    // 15-4練習問題
    throw new IOException();

  }

}

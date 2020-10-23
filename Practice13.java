package jp.learning.javastudy;

public class Practice13 {
    public static void main(String[] arg){
        Y[] obj = new Y[2];
        obj[0] = new A();
        obj[1] = new B();

        for (Y o: obj) {
            o.b();
        }

    }
}

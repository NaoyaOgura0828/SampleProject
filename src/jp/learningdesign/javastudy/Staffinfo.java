package jp.learningdesign.javastudy;

class Staff {
    String name; // 名前
    int staffid; // 社員番号
    String email; // メールアドレス
}

public class Staffinfo {
    public static void main(String[] args) {
        Staff yamada = new Staff();
        yamada.name = "Taro Yamada";

        System.out.println(yamada.name);

    }
}
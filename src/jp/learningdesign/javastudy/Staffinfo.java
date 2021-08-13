package jp.learningdesign.javastudy;

class Staff {
    String name; // 名前
    int staffid; // 社員番号
    String email; // メールアドレス

    public void sayhello() {
        System.out.println("Hello " + this.name); // Helloの後に名前を付ける(Staffからnameを呼び出す)
    }
}

public class Staffinfo {
    public static void main(String[] args) {
        Staff yamada = new Staff(); // Staffクラスのyamadaオブジェクトを作成
        yamada.name = "Taro Yamada"; // yamadaオブジェクトのnameに"Taro Yamada"を格納

        yamada.sayhello(); // sayhelloメソッドを呼び出す処理

        // System.out.println(yamada.name); // yamadaオブジェクトのnameを表示する

    }
}
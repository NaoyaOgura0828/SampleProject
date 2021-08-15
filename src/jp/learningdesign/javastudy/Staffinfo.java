package jp.learningdesign.javastudy;

class Staff {
    String name; // 名前
    int staffid; // 社員番号
    String email; // メールアドレス

    public void sayhello() {
        /* Hello+名前の形式で表示する */
        System.out.println("Hello " + this.name); // Helloの後に名前を付ける(Staffからnameを呼び出す)
    }

    public Staff(String name, int staffid, String email) {
        /* Staffクラスのコンストラクタ */
        super();
        this.name = name;
        this.staffid = staffid;
        this.email = email;
    }

    /* getterメソッドとsetterメソッド */
    public String getName() {
        /* nameを取得する*/
        return name;
    }

    public void setName(String name) {
        /* nameに文字列を与えるとnameに文字列をセットする */
        this.name = name;
    }

    public int getStaffid() {
        /* staffidを取得する*/
        return staffid;
    }

    public void setStaffid(int staffid) {
        /* staffidに数値を与えるとstaffidに数値をセットする */
        this.staffid = staffid;
    }

    public String getEmail() {
        /* emailを取得する*/
        return email;
    }

    public void setEmail(String email) {
        /* emailに文字列を与えるとemailに文字列をセットする */
        this.email = email;
    }
}

class RemoteStaff extends Staff {
    /* Staffクラスを継承しRemoteStaffクラスを生成 */
    public String location; // RemoteStaff固有のフィールドとして"勤務地"を作成
    public RemoteStaff(String name, int staffid, String email) {
        super(name, staffid, email); // superでStaffクラス（スーパークラス）のコンストラクタを呼び出す
    }
}
public class Staffinfo {
    /* 社員情報を定義するクラス */
    public static void main(String[] args) {
        Staff yamada = new Staff("Taro Yamada", 12345 , "yamada@abc.co.jp"); // Staffクラスのコンストラクタをnew演算子で呼び出している
        RemoteStaff tanaka = new RemoteStaff("Hanako Tanaka", 12456, "tanaka@abc.co.jp"); // RemoteStaffクラスのコンストラクタをnew演算子で呼び出している
        tanaka.location = "大阪"; // tanakaさんの勤務地として"大阪"をセット


        // yamada.name = "Taro Yamada"; // yamadaオブジェクトのnameに"Taro Yamada"を格納

        // yamada.sayhello(); // sayhelloメソッドを呼び出す処理

        // System.out.println(yamada.name); // yamadaオブジェクトのnameを表示する

        /* yamadaさんの社員情報を表示する */
        System.out.println("【社員情報】"); // 【社員情報】と表示
        System.out.println("氏名: " + yamada.getName()); // 氏名を呼び出し表示
        System.out.println("社員番号: " + yamada.getStaffid()); // 社員番号を呼び出し表示
        System.out.println("Email: " + yamada.getEmail()); // Emailを呼び出し表示

        /* tanakaさんの社員情報を表示する */
        System.out.println("【社員情報】"); // 【社員情報】と表示
        System.out.println("氏名: " + tanaka.getName()); // 氏名を呼び出し表示
        System.out.println("社員番号: " + tanaka.getStaffid()); // 社員番号を呼び出し表示
        System.out.println("Email: " + tanaka.getEmail()); // Emailを呼び出し表示
        System.out.println("勤務地: " + tanaka.location); // 勤務地を呼び出し表示
    }
}
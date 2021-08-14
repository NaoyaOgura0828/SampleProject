package jp.learningdesign.javastudy;

public class CommonMultiple3 {
    /* 1から20未満までの2と3の公倍数以外を表示するプログラム */
    public static void main(String[] args) {
        int i = 1; // iの初期値を1とする
        while (i < 20) { // iが100になるまでwhileループさせる
            if (!((i % 2 == 0) && (i % 3 == 0))) { // もし2で割った時の余りが0かつ3で割った時の余りが0ではないならiに代入する（NOT演算子）
                System.out.println(i); // iを表示する
            }
            i ++ ; // iに1ずつ数値を加算する（インクリメント演算子）
        }
    }
}

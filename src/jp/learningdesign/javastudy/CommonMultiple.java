package jp.learningdesign.javastudy;

public class CommonMultiple {
    /* 1から100までの公倍数を求めるプログラム */
    public static void main(String[] args) {
        int i = 1; // iの初期値を1とする
        while (i < 100) { // iが100になるまでwhileループさせる
            if ((i % 2 == 0) && (i % 3 == 0)) { // もし2で割った時の余りが0かつ3で割った時の余りが0ならiに代入する（論理積）
                System.out.println(i); // iを表示する
            }
            i ++ ; // iに1ずつ数値を加算する（インクリメント演算子）
        }
    }
}

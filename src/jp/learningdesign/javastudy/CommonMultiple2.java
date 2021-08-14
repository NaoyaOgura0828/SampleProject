package jp.learningdesign.javastudy;

public class CommonMultiple2 {
    /* 1から50未満の範囲で2または3の倍数を表示するプログラム */
    public static void main(String[] args) {
        int i = 1; // iの初期値を1とする
        while (i < 50) { // iが50になるまでwhileループさせる
            if ((i % 2 == 0) || (i % 3 == 0)) { // もし2で割った時の余りが0または3で割った時の余りが0ならiに代入する（論理和）
                System.out.println(i); // iを表示する
            }
            i ++ ; // iに1ずつ数値を加算する（インクリメント演算子）
        }
    }
}

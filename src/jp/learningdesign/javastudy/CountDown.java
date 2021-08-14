package jp.learningdesign.javastudy;

public class CountDown {
    /* 10から0まで（0を除く）数字を1ずつカウントダウンしていくプログラム */
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) { // 10から1ずつforループでカウントダウンしていきiに代入する
            System.out.println(i); // iを出力する
        }
    }
}

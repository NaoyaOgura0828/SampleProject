package jp.learningdesign.javastudy;

public class DisplayMonth {
    /* 月の英名を表示するプログラム */
    public static void main(String[] args) {
        int month = 2; // monthに2を代入する
        switch (month) {
            /* monthに代入された数字による条件分岐 */
            case 1: // 1の場合
                System.out.println("January");
                break;
            case 2: // 2の場合
                System.out.println("February");
                break;
            case 3: // 3の場合
                System.out.println("March");
                break;
            case 4: // 4の場合
                System.out.println("April");
                break;
            default: // 条件分岐に合致しない場合
                break;
        }
    }
}

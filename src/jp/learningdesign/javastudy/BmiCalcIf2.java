package jp.learningdesign.javastudy;

import java.util.Scanner;

public class BmiCalcIf2 {
    /* BMI（体格指数）を計算するプログラム
    *  BMI = 体重 / (身長 * 身長)
    *  体重 kg、 身長 cm
    */
    public static void main(String[] args) {
        double weight, height, bmi;

        // weight = 71; // 体重を入力
        // height = 180; // 身長を入力

        Scanner stdIn = new Scanner(System.in); // stdInインスタンスの作成
        System.out.println("体重は？(kg) :"); // 体重を入力するように促すメッセージを表示
        weight = stdIn.nextDouble(); // 入力された体重をweightへ格納
        System.out.println("身長は？(cm) :"); // 身長を入力するように促すメッセージを表示
        height = stdIn.nextDouble(); // 入力された身長をheightへ格納

        height /= 100; // 身長をcmからmに変換しheightに代入

        bmi = weight / (height * height); // BMIを計算

        System.out.println("あなたのBMIは、 " + bmi + " です。"); // メッセージと共にBMIを出力

        if (bmi < 18.5) {
            System.out.println("やせ型です"); // bmiが18.5未満だった場合に"やせ型です"と表示する
        } else if (bmi < 25) {
            System.out.println("標準です"); // bmiが25未満だった場合に"標準です"と表示する
        } else {
            System.out.println("肥満です"); // bmiが25以上だった場合に"肥満です"と表示する
        }
    }
}

package jp.learningdesign.javastudy;

public class BmiCalc {
    /* BMI（体格指数）を計算するプログラム
    *  BMI = 体重 / (身長 * 身長)
    *  体重 kg、 身長 m
    */
    public static void main(String[] args) {
        double weight, height, bmi;

        weight = 71; // 体重を入力
        height = 1.8; // 身長を入力
        bmi = weight / (height * height); // BMIを計算

        System.out.println(bmi); // BMIを出力
    }
}

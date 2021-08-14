package jp.learningdesign.javastudy;

public class DisplayMonth2 {
    /* 月の英名をリストから順番に表示するプログラミング */
    public static void main(String[] args) {
        String[] month = {
                /* 1月から12月までの英名リスト */
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        for (int i = 0;i < 12; i++) { // iに0から12未満をforループして1ずつ加算する
            System.out.println(month[i]); // iを引数としてmonthを表示する
        }
    }
}

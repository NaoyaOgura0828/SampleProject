package jp.learningdesign.javastudy;

import java.util.PrimitiveIterator;

class Computer {
    /* PCスペックの定義 */
    public String os; // 使用OS
    public int memory; // 搭載メモリ
    public int storage; // 搭載ストレージ
}

public class ComputerInfo {
    /* PCスペック情報の定義 */
    public static void main(String[] args) {
        /* "desktop"インスタンスを作成し表示する */
        Computer desktop = new Computer(); // "desktop"インスタンスを作成する
        desktop.os = "Windows 10"; // OS名
        desktop.memory = 4; // メモリ容量（GB）
        desktop.storage = 256; // ストレージ容量（GB）

        /* "desktop"スペック情報を表示する */
        System.out.println("OS: " + desktop.os); // osを呼び出し出力する
        System.out.println("Memory: " + desktop.memory); // memoryを呼び出し出力する
        System.out.println("Storage: " + desktop.storage); // storageを呼び出し出力する


        /* "desktop2"インスタンスを作成する */
        Computer desktop2 = desktop; // "desktop"インスタンスを参照し"desktop2"インスタンスを新たに作成する

        desktop2.os = "Ubuntu"; // OS名

        /* "desktop2"スペック情報を表示する */
        System.out.println("\nOS: " + desktop2.os); // osを呼び出し出力する
        System.out.println("Memory: " + desktop2.memory); // memoryを呼び出し出力する
        System.out.println("Storage: " + desktop2.storage); // storageを呼び出し出力する

        /* "desktop"インスタンスを参照しているのでOS名がオーバーライドされる */
        System.out.println("\nOS: " + desktop.os); // osを呼び出し出力する
        System.out.println("Memory: " + desktop.memory); // memoryを呼び出し出力する
        System.out.println("Storage: " + desktop.storage); // storageを呼び出し出力する

    }
}

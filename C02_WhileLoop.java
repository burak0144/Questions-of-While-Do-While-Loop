package day18_while_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 7 ) Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        int birlerBasamagi = 0;
        int toplam = 0;

        while (input >= 0) {

            System.out.println("sayi girin");
            input = scanner.nextInt();
            int sayi=input;

            while (input > 0) {
                birlerBasamagi = input % 10;
                toplam += birlerBasamagi;
                input /= 10;
            }
            System.out.println(sayi+" sayisinin rakamlar toplami = " + toplam);
            toplam = 0;
            birlerBasamagi = 0;


        }

    }
}

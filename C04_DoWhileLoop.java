package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
          Kullanicidan tam sayilar alin
          kullanici cift sayi girdigi muddetce sayiyilari yazdirin
          tek sayi girdiginde islemi bitirin
         */
        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        //looplarda kullanacagimiz variable'lari looptan once olusturmaliyiz
        //while loopda loopdan once olusturdugumuz bu variable'a atadigimiz deger onemlidir
        //loopa girebilmesi icin ona gore atamaliyiz
        while (sayi%2==0) {
            System.out.println("lutfen sayi girin");
            sayi=scanner.nextInt();
            if (sayi%2==0)
            System.out.println(sayi+" cift sayidir");
            else {
                System.out.println("girlen tek sayidir,uzgunum benden bu kadar");
            }

        }
        //do while da ilk atanan deger onemli degildir her durumda kod calisir
        //ama ilk atanan yanlis oldugu durumda direkt yazdirmamasi icin ilk basta kontrol yapmamiz gerekir
        do {
            System.out.println("lutfen sayi girin");
            sayi=scanner.nextInt();
            if (sayi%2==0){
                System.out.println(sayi+" cift sayidir");
            }else System.out.println("girlen tek sayidir,uzgunum benden bu kadar");
        }while (sayi%2==0);

    }
}

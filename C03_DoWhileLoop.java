package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //while loop ta once kontrol edip sonra islem yaptigimiz icin islem bittikten sonra
        //loopun kirilmasi icin bir kez daha basa donup kontrol ettigi icin bu durumda
        //fazladan bir islem yapiliyor

        int sayi=7;       //7,8,9,10  kontrol ediliyor
        while (sayi<10){
            System.out.print(sayi+" ");
            sayi++;
        }
        System.out.println("");
        //do-while loop ile calistirdigimizda bu dezavantaj ortadan kalkar
        //once yazdirir sonra kontrol eder
        sayi=7;     //7direkt yazdiriyor 8,9,10 kontrol ediliyor
        do {
            System.out.print(sayi+" ");
            sayi++;
        }while (sayi<10);
    }
}

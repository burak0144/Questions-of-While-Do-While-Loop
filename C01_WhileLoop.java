package day18_while_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
         /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
        char bas='f';
        char bit='t';
        char temp=bas;
        String buyult="";

        while (temp<=bit){
            buyult=(temp+"").toUpperCase();
            System.out.print(buyult+" ");
        temp++;
        }
    }
}

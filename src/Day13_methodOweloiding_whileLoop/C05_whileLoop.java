package Day13_methodOweloiding_whileLoop;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {
        //kullanicidan toplam uzere sayiii alin
        //girilen sayilarin toplami 500 olur veya gecerse
        //"bu kadar sayi yeter" deyip toplami yazdirin


        //bu soru iilla da for loop ile yapalim dersek adim sayisini
        //tahmin edip biraz abartabaliriz
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int girilenSayi=0;

        for (int i = 1; i <=10000 ; i++) {
            System.out.println("toplamak uzere tam sayi giriniz");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;
            if (toplam>=500){
                System.out.println("bu kadar sayi yeter.Toplamlari  "+toplam+" oldu");
                break;
            }
                    //ayni soruyu while loop ile yaaplm

                    toplam=0;
                    girilenSayi=0;
                    while (toplam<500){
                        System.out.println("toplamak uzere tam sayi giriniz");
                        girilenSayi=scan.nextInt();
                        toplam+=girilenSayi;
                    }
            System.out.println("bu kadar sayi yeter.Toplamlari "+toplam+"oldu");
        }

    }
}

package day28_exeptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {
        //kullanıcıdan iki tam sayi alip
        //sayıları birbirine bolup sonucu yazdırın
        Scanner scan=new Scanner(System.in);

        System.out.println("birbirine bolmek icin iki tam sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        try {
            //1-try bolumu:yapmak istedigimiz ama exc.riski olusuturan kodlar
            System.out.println("iki sayının bolumu : "+sayi1/sayi2);
        } catch (ArithmeticException e)
        //2-catch(): beklediğimiz muhtemel exc.deklatre ettiğimiz,
        //            bu exc. gerceklesirse hata dokumanını store edebilecegimiz variable
        {
           // throw new RuntimeException(e);bunun yerine acıklama da yazabiliriz
            System.out.println("bolecek sayı sıfır olamaz");//22.satırın acıklaması
            e.printStackTrace();
            //catch blogu:exception gercekleşirse calısması istedgimiz kodlar
            //              burayı yazarken eoncelikle
            //              exp/olustugunda kodların calışması dursun mu? yoksa devam mi etsin
            //              karar vermeliyiz.
        }
    }
}

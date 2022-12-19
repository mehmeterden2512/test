package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
       /* Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String girilenIisim=scan.nextLine();
        System.out.println("soyadinizi giriniz:");
        String girilenSoyisim=scan.nextLine();
        System.out.println("lütfen yasınızı giriniz");
        double yas=scan.nextDouble();



        System.out.println("isminiz:"+girilenIisim);
        System.out.println("soyisminiz:"+girilenSoyisim);
        System.out.println("yasınız:"+yas);
        System.out.println("Kaydiniz basariyla tamamlanmiştir");


    }
}

package day28_exeptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        /*
        Try-catch bloklarının amacı
        riski 0 yapmak deg,il
        kodu iyi analiz yapıo
        Java nın cozemeycegi durumlarda ne yapması gerektiğini kendisine soylemektir
        java try blogunda bas edemeyecegi bir sorıunla karsılasırsa siz o sorunu deklare edince ye kadar yani
        catc(); satirina kadaer calısmayı durudur bu durumda sorun olun satırile catc() satırı arasında ki kodlar calışmaz

         */
        //kullanıcıdan iki tam sayi alip
        //sayıları birbirine bolup sonucu yazdırın
        Scanner scan=new Scanner(System.in);

        System.out.println("birbirine bolmek icin iki tam sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        try {
            System.out.println("iki sayının bolumu: "+sayi1/sayi2);

            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayi sıfır olamaz");
            System.out.println(e.getCause());
        }
    }
}

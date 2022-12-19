package Day06_ifElseStatements;

import java.util.Scanner;

public class C09_nEstedİfElse {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir”
        // yazdirin.
        /*
        değişkenler birden fazla ise
        değişkenler biri
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi\nK :Kadın,E:Erkek ve yaşınızı girin");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("yasinizi giriniz");
        double yas=scan.nextDouble();


        if (cinsiyet=='K' || cinsiyet=='k'){ // Kadin olanlar icin bu bolum calisacak

            if (yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("emekli olmak icin " +(60-yas) + " yil daha calismalisin");
        } else if (cinsiyet=='E' || cinsiyet=='e') { // Erkek olanlar icin bu bolum calisacak

            if (yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=65) System.out.println("Emekli olabilirsin");
            else System.out.println("emekli olmak icin " +(65-yas) + " yil daha calismalisin");
        } else {
            System.out.println("cinsiyet bilgisi hatali");
        }


    }
}

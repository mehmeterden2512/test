package Day06_ifElseStatements;

import java.util.Scanner;

public class C06_ifElseStatemens {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir”
        // yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi\nK :Kadın,E:Erkek ve yaşınızı girin");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("yasinizi giriniz");
        double yas=scan.nextDouble();
         if (cinsiyet=='K'||cinsiyet=='k'&&yas>=60&&yas<80){
             System.out.println("emekli olabir");
         } else if (cinsiyet=='K'||cinsiyet=='k'&&yas>=18&&yas<80) {
             System.out.println("emekli olmak için"+(60-yas)+"çalışman gerekir");

         } else if (cinsiyet=='E'||cinsiyet=='e'&&yas>65&&yas<80) {
             System.out.println("emekli olabilir");
         } else if (cinsiyet == 'E' || cinsiyet == 'e' && yas>=18&&yas<80) {
             System.out.println("emekli olmak için"+(65-yas)+"çalışman gerekir");
         }else {
             System.out.println("gecersiz bilgi" );
         }

    }


    }

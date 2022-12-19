package Day06_ifElseStatements;

import java.util.Scanner;

public class C07_ifElseStatements {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut
        // kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez, 25-30 arasi ise
        // kilolu, 20-25 arasi ise normal, 20’den kucukse zayif
        // yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kg ve boyunuzu cm olarkgiriniz");
        double kg=scan.nextDouble();
        double boy=scan.nextDouble();
       double vke=(kg*10000)/(boy*boy);
        System.out.println("vücüt kitle endeksiniz:"+vke);
         if(vke>=30){
             System.out.println("obez");
         } else if (vke>25) {
             System.out.println("kilolu");

         } else if (vke>20) {
             System.out.println("normal");

         }else {
            System.out.println("zayıf");
        }


    }
}

package Day06_ifElseStatements;

import java.util.Scanner;

public class C02_ifElseStatements {
    public static void main(String[] args) {
        //kullanicidan kenr uzunluk al ikiz
        // se ikiz kenar
        // üçgen degilse değil yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin kenar uzunlıklarini giriniz");
        double knr1=scan.nextDouble();
        double knr2=scan.nextDouble();
        double knr3=scan.nextDouble();
     if ((knr1==knr2&&knr1!=knr3)||
             (knr2==knr3&&knr2!= knr1)||
             (knr3==knr1&&knr3!=knr2)){
         System.out.println("ikiz kenar");

     }else {
         System.out.println("ikiz kenar değil");
     }


    }
}

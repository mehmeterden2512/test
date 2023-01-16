package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintfCarpimTablosu {
    public static void main(String[] args) {
        //kullanicadan bir rakam alın ve carpım tablosu olusturun
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        while (girilenSayi<2||girilenSayi>9) {
            try {
                System.out.println("carpım tablosu olusturmak icin bir tekrar yapınız");
                girilenSayi=scan.nextInt();
                if (girilenSayi>1&&girilenSayi<10){
                    break;
                }
                System.out.println("carpım tablosu icin pozitif bir rakam girmelisiniz");
            } catch (InputMismatchException e) {
                System.out.println("carpım tablosu icin pozitif bir rakam girmelisiniz");
                scan.next();
            }
        }

        for (int i = 1; i <girilenSayi ; i++) {
            for (int j = 1; j <girilenSayi ; j++) {
                int carpim=i*j;
                System.out.printf("%2d ",carpim);//- koyunca sola yapmayınca saga

            }
            System.out.println("");
        }


    }

}

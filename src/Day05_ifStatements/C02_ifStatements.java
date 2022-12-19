package Day05_ifStatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {

 /*
            Basit if cumleleri kodun geri kalanindan bagimsizdir
            sadece 1 sarta odaklanir
            o sart true ise if body calisir
            sart false ise if body calismaz( KOD CALISIR)
            birden fazla bagimsiz if cumlesi kullanilmissa
            her cumle birbirinden bagimsiz olacagindan
            bazi degerler icin tum if body'leri calisirken
            bazi degerler icin hic bir if body'si CALISMAYABILIR
       /*


        //kullanicidan bir sayi "
        // alip pozitif ise pozitif
        //100 ile 999 arasinda ise "pozitif üç basamkalı sayı
        //3 e bölenebiliyorsa "3'ün katı"
        // son basamagi =7 ise mükemmel"
        //seceneklerin den uygun olanları yazın
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin");
        double sayi=scan.nextDouble();


        if (sayi>0){
            System.out.println("pozitif sayi");
        }  if (100<=sayi&&sayi<=999) {
            System.out.println("pozitif üç basamaklı sayi");

        }  if (sayi%3==0) {
            System.out.println("3'ün kati");

        }  if (sayi%10==7||sayi%10==-7) {
            System.out.println("mükemmel");


        }


    }
}

package Day11_forLoop;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
        //Ahmet Bulutluoz
        //  12:27 PM
        //Soru 3- Kullanicidan baslangic ve bitis degeri
        // olarak pozitif sayilar alin, sinirlar dahil
        // olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse,
        // uyari yazdirip islemi sonlandirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen baslangic ve bitis degerleri icin iki pozitif sayi giriniz");
        int baslangic=scan.nextInt();
        int bitis=scan.nextInt();
        if (bitis<baslangic){
            System.out.println("baslangic degeri bitis degerinden kucuk olmali");

        }else {
            int toplam=0;
            for (int i = baslangic; i <=bitis; i++) {
                toplam+=i;

            }
            System.out.println(baslangic+ "ile" +bitis+ " arasindaki sayilarin toplami:"+toplam);

        }

    }
}

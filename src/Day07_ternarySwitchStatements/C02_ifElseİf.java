package Day07_ternarySwitchStatements;

import java.util.Scanner;

public class C02_ifElseİf {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi alın
        //sayi negatif sayi ise "negatif sayi",
        //sayi rakam ise girilen sayi rakam
        //sayi iki basamakli ise girilen sayi iki basamakli
        //sayi iki basamakli sayidan buyukse buyuk sayı yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi girin");
        int girilenSayi=scan.nextInt();

if (girilenSayi<0) System.out.println("negatif sayi");
else if (girilenSayi<=9) System.out.println("girilen sayi rakam");
else if (girilenSayi<=99) System.out.println("iki basamakli");
else System.out.println("büyük sayi");

    }
}

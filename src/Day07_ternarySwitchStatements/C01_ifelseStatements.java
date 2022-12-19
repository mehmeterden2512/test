package Day07_ternarySwitchStatements;

import java.util.Scanner;

public class C01_ifelseStatements {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi alın
        //sayi rakam ise girilen sayi rakam
        //sayi iki basamakli ise girilen sayi iki basamakli
        //sayi iki basamakli sayidan buyukse buyuk sayı yazdırın
/*
eğer if ELSE cümleleri 'ELSE'ile bitmiyorsa tüm durunlari kapsamaz
yani bazi değerler için if body si çalişmaz
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi girin");
        int girilenSayi=scan.nextInt();
        if (0<=girilenSayi&&girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=girilenSayi&&girilenSayi<=99) System.out.println("girilen sayi iki basamakli");

        else if (girilenSayi>=100) System.out.println("büyük sayi");




    }
}

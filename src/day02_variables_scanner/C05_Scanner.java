package day02_variables_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullnacidan ismini alin
        //ve girilen ismi büyük harfle yazdirin.
        //kullanicidan deger almak icin 3islem yapmamiz gerekir
        //1.adim scanner objesi olusturmak

        Scanner scan=new Scanner(System.in);
        //2.adim kullaniciya ne istediginizi soyleyin.
        System.out.println("adiinizi girin:");
        //3. adim kullanicinin girecegi degeri kaydedecegi bir variable olusturun
        //scan objesi işe ilgili methodu olusturarak
        //olusturdugunuz variable atayin


        String girilenIsim=scan.nextLine();
        //artik kullanicinin girdigi deger girilen isim variable da kayitli

        System.out.println(girilenIsim.toUpperCase());


    }
}

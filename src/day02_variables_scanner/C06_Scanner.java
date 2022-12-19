package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //Kullanicadan bir sayi isteyin sayinin karesini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("karesini almak istediginiz sayi giriniz:");
        double girilenSayi=scan.nextDouble();
        System.out.println("girilensayi karesi:"+girilenSayi*girilenSayi);




    }
}

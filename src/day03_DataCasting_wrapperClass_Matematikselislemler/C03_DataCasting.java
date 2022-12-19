package day03_DataCasting_wrapperClass_Matematikselislemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        System.out.println(28/5);//5
        System.out.println(29/3);//9


int sayi=25;
int sayi2=6;
        System.out.println(sayi/sayi2);//4
        double dbl=6;
        System.out.println(sayi/dbl);
        //kullanicidan iki double tam sayi alin sonucu ondalık olarak yazdirin
        Scanner scan=new Scanner(System.in);
        // kullanicidan 2 tamsayi alin
        // 1.tamsayiyi 2.ye bolup sonucu ondalik olarak yazdirin
        System.out.println("Lutfen birbirine bolmek icin iki tamsayi giriniz");
        int ilkSayi=scan.nextInt();
        int ikinciSayi=scan.nextInt();
        System.out.println("Iki sayinin bolme sonucu : " + ilkSayi/(double)ikinciSayi);


    }

}

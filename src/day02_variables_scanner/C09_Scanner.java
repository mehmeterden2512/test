package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi1 giriniz");
                  int sayi1=scan.nextInt();
        System.out.println("Lutfen sayi2 giriniz");
        int sayi2=scan.nextInt();
        int temp;
        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;
        System.out.println("sayilarin yerini degistirdim"+"\nsayi1 yeni degeri:"+sayi1+"\nsayi2 yeni degeri:"+sayi2
        );


    }
}

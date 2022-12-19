package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        //kullsanicidan iki kenar uzunlugu alıp alanini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki kenar uzunlugu girin");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        System.out.println("dik.alan:"+kenar1*kenar2);

}}
package Day06_ifElseStatements;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen notunuzu girin");
        double not=scan.nextDouble();
        if (not<0||not>100){
            System.out.println("geçersiz not");

        } else if (not>=85) {
            System.out.println("notunuz AA");

        } else if (not>=65) {
            System.out.println("notunuz BB");
        } else if (not>=50) {
            System.out.println("notunuz CC");

        }else {
            System.out.println("notunuz DD kaldiniz");
        }


    }
}

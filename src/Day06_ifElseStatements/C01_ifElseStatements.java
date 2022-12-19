package Day06_ifElseStatements;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin kenar uzunlıklarini giriniz");
        double knr1=scan.nextDouble();
        double knr2=scan.nextDouble();
        double knr3=scan.nextDouble();
        if (knr1==knr2&&knr2==knr3&&knr1>0){
            System.out.println("eşkenar üçgen");
        }else {
            System.out.println("eşkenar değil");
        }
    }
}

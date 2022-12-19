package Day06_ifElseStatements;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
//Soru 4- Kullanicidan bir karakter girmesini
// isteyin, girilen karakterin
// buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
    System.out.println("lütfen bir karakter girin");
     char girilenKrk=scan.next().charAt(0);

        if (girilenKrk>='A'&&girilenKrk<='Z'){
            System.out.println("büyük harf");
        }else {
            System.out.println("büyük harf değil");
        }


    }
}

package Day05_ifStatements;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
         //oru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”, 5 ile bolunebiliyorsa “
        // Bes ile bolunebilen sayi” yazdirin.
/*
        Soru 3- Kullanicidan bir sayi alin,
        sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Eger if body'si icin yazilacak kod 1 satirdan fazlaysa
        MUtlaka { } kullanilmalidir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz");
        int  girilenSayi=scan.nextInt();
        if (girilenSayi%3==0)System.out.println("lütfen bir tam sayi giriniz");
        if (girilenSayi%5==0) System.out.println("bes ile bölünebilen sayi");

    }



        }


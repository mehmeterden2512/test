package Day05_ifStatements;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ucgenin 3 kenar uzunlugunu giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        if (kenar1==kenar2 &&kenar2==kenar3 && kenar3>0) System.out.println("Eskenar Ucgen");
        if (!(kenar1==kenar2 &&kenar2==kenar3)) System.out.println("Eskenar Ucgen değildir");




    }
}

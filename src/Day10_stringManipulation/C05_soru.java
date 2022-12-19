package Day10_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin
        String str="Evden calisiyorum, sirkete gitmeye gerek yok";
        String yeniStr=str.toLowerCase(Locale.ROOT);
        if (yeniStr.contains("ev")&&yeniStr.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if (yeniStr.contains(" is")) {
            System.out.println("calismak guzeldir");

        } else if (yeniStr.contains("ev")) {
            System.out.println("calismak guzeldir");

        }else {
            System.out.println("cok calısman lazim");
        }

    }
}

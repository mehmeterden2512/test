package Day11_forLoop;

import java.util.Scanner;

public class C07_TerseCevirme {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen tersten yazmak istediginiz metni girin");
        String metin=scan.nextLine();
        String tersMetin="";
        int i;
        for ( i =metin.length()-1; i >=0 ; i--) {
           // tersMetin+=metin.charAt(i);bunla da yapabiliriz
            tersMetin+=metin.substring(i,i+1);
        }
        System.out.println(tersMetin);











    }
}

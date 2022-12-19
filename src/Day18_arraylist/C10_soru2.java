package Day18_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_soru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan istedigi kadar isim alip,
         Q’ya bastiginda girdigi isimleri bize liste olarak
          dondurecek bir method olusturun
         */
    List<String> isimlerListesi=isimListesiOlustur();

        System.out.println(isimlerListesi);


    }

public static List<String> isimListesiOlustur(){
    List<String> isimListesi=new ArrayList<>();
    String girilenIsim="";
    Scanner scan=new Scanner(System.in);

    while (!girilenIsim.equalsIgnoreCase("Q")){
        System.out.println("listeye eklemek icin bir isim girin\nbitirmek için q ya basin");
        girilenIsim=scan.nextLine();
        if (!girilenIsim.equalsIgnoreCase("q")){
            isimListesi.add(girilenIsim);
        }
    }
    return isimListesi;
}


}

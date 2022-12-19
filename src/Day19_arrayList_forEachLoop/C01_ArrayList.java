package Day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayList {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.
        Scanner scn=new Scanner(System.in);
        System.out.println("Tam bolenlerini listelemek icin pozitif bir sayi girin:");
                int girilenSayi=scn.nextInt();
                if (girilenSayi<=0){
                    System.out.println("gecersiz sayi");
                }else {
                   List<Integer> tamBolenlerListesi= tamBolenlerListesiOlustur(girilenSayi);
                    System.out.println(tamBolenlerListesi);
                }
    }
    public static List<Integer> tamBolenlerListesiOlustur(int girilenSayi){
        List<Integer> tamBolenlerListesi=new ArrayList<>();
        for (int i = 1; i <=girilenSayi ; i++) {
            if (girilenSayi%i==0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}

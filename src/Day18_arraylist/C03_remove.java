package Day18_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);//[10, 5, 7, 9]

        // sayilar.remove(5)

             /*   //eger listemiz Integer 'lardan olıusuyorsa paramatre olarak yazdigimiz sayinin
        index mi yoksa silmek istediğimiz obje mi oldugunu belirsiz olmasin diye
        Java otamtik olarak  girilen sayiyi index kabul eder.


            Eger Integer'lardan olusan bir listede
            obje olarak bir elementi silmek isterseniz
            once onu tanimlamalisiniz
              */
        Integer silinecekElement = 5;//not icinde acıklama
        System.out.println(sayilar.remove(silinecekElement));//true

        System.out.println(sayilar);//[10, 7, 9]

        silinecekElement=20;//olmayan bir elemani silmeye calışirsak false döner
        System.out.println(sayilar.remove(silinecekElement));//false


    }
}
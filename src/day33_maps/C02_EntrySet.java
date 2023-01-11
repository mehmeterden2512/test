package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        //tum ogrencileri 101 ="Ali-Can-11-H-MF seklinde yazdiralim
        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("=========================");

        //once ogrenci numalari elde edelim
        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet();
        for (Integer eachKey : ogrenciNoSeti
        ) {
            System.out.println(eachKey + " = " + ogrenciMap.get(eachKey));
        }
        /*
        aslında bizden istenen map icindeki elementler
        Java map'deki elementleri key -value iklisi olarak BİRLİKTE alabilmemiz icin
        ENTRY Interface'i olusturmus.
        ...
        ....
        Entry<Integer,String>

         */


        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("=========================");


        for (Map.Entry<Integer, String> integerStringEntry : ogrenciMap.entrySet())
        {//ogrenciMap.entrySet()  yazip  imlec yanindayken alt+enter yapilinca sol tarafi otomotik yapabiliriz
            System.out.println(integerStringEntry);
        }
        //2.  yol usttteki kaydetmeye gerek yok
        // Set<Map.Entry<Integer,String>>ogrenciEntrySet= ogrenciMap.entrySet();
       /* for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {
            System.out.println(eachEntry);
        }

        */
    }
}

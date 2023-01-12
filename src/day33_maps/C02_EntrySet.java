package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        //tum ogrencileri 101 ="Ali-Can-11-H-MF seklinde yazdiralim
        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}
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
        entry'ler de map ile ayni data yapisina sahip olmalidir
          ornegin ogrenci map'ini dusunursek entry'ler
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

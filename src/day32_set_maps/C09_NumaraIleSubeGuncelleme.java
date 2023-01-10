package day32_set_maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {
        //verielen numarasi ogrencinin sube ismini
        // verieln sube yapan bir method olusturun
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

      ogrenciMap=  MapMethodDepo.numaraIleSubeGuncelleme(ogrenciMap,104,"M");
        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-k-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-M-MF, 105=Sevgi-Cem-11-K-TM, 106=Sevgi-Can-10,H-MF}
        ogrenciMap=MapMethodDepo.numaraIleSubeGuncelleme(ogrenciMap,101,"L");
        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-L-MF, 102=Veli-Cem-10-k-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-M-MF, 105=Sevgi-Cem-11-K-TM, 106=Sevgi-Can-10,H-MF}
    }
}

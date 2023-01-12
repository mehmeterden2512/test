package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtirma {
    public static void main(String[] args) {
        //ogrenci map indeki tum sınıf degerlerini bir artirin.
        //12. sinifta olan varsa sınıf bilgisini mezun yapalım.

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo.siniflariArtir(ogrenciMap);
        MapMethodDepo.tumListeYazdir(ogrenciMap);
        MapMethodDepo.siniflariArtir(ogrenciMap);
        MapMethodDepo.tumListeYazdir(ogrenciMap);



    }
}

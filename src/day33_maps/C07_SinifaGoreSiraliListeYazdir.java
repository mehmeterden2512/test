package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdir {
    /*
    tum ogrenci listesini
    sınıf sube  isim soyisim no seklinde
    dogal sıralı olarak yazdiran bir method olusturun
     */
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifSiraliListeOlustur(ogrenciMap);
    }
}

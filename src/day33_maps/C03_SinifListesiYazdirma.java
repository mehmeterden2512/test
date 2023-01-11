package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdirma {
    // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
    // bir liste olarak yazdiran bir method olusturun
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.subeListesiYazdir(ogrenciMap,"10");
    }




}

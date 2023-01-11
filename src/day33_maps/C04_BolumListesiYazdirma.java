package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {
    public static void main(String[] args) {
        //Verilen bolumdeki ogrencilerin
        //No,isim soyisim ve sınıflarini yazdiran
        //bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.bolumListesiOlusturma(ogrenciMap,"tm");
    }
}

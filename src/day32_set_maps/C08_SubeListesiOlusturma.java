package day32_set_maps;

import java.util.Map;

public class C08_SubeListesiOlusturma {
    //Verilen sinif ve sube ismi ile sınıf listesini yazdiran method olusturun
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();


        MapMethodDepo.sinifListesiYazdir(ogrenciMap,"11","H");//Ali  Can

        MapMethodDepo.sinifListesiYazdir(ogrenciMap,"10","k");
    }
}

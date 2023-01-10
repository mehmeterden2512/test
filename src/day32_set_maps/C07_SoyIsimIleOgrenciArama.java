package day32_set_maps;

import java.util.Map;

public class C07_SoyIsimIleOgrenciArama {
    // ogrenci map'de aradigimiz soyisim'deki ogrencilerin
    // isim,soyisim,sinif,ve sube bilgilerini
    // bir tablo olarak yazdiran bir metod olusturun

    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyIsimleOgrenciListesiYazdirma(ogrenciMap,"Can");

        MapMethodDepo.soyIsimleOgrenciListesiYazdirma(ogrenciMap,"Cem");
    }
}

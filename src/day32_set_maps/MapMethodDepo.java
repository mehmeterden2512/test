package day32_set_maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {
    //Bize ogrenciMap donduren bir method olusturun
    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogreciMap = new HashMap<>();

        ogreciMap.put(101, "Ali-Can-11-H-MF");
        ogreciMap.put(102, "Veli-Cem-10-k-TM");
        ogreciMap.put(103, "Ali-Cem-11-K-TM");
        ogreciMap.put(104, "Ayse-Can-10-H-MF");
        ogreciMap.put(105, "Sevgi-Cem-11-K-TM");
        ogreciMap.put(106, "Sevgi-Can-10,H-MF");
        return ogreciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {
        // 1- tum value'leri bir collection olarak kaydedelim
        //    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection = ogrenciMap.values();
        // 2- for-each kullanarak her bir value'yu ele alalim  Ali-Can-11-H-MF
        // 3- -'yi kullanarak split yapalim [Ali, Can, 11, H, MF]
        // 4- split yaptigimiz array'den isim bilgisini alalim 0.index
        // 5- eger value'den aldigimiz isim, aranan isim ile ayni ise
        //    true dondurup, for-each'i bitirelim
        // 6- for-each bittiginde true olmadiysa false dondurelim
        for (String eachValue:valuesCollection
        ) {

            String[] valueArr= eachValue.split("-");
            String valuedekiIsim= valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;
            }

        }
        return false;
    }

    public static void soyIsimleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyIsim) {
        // 1- map'deki value'leri bir collection olarak kaydedelim
        //    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]
        Collection<String> ogrenciValueCollection=ogrenciMap.values();
        // listenin ilk satiri olarak basliklari yazdiralim
        System.out.println("Isim  Soyisim  Sinif Sube");

        // 2- for-each ile her bir value bilgisini ele alalim Ali-Can-11-H-MF
        // 3- value'yu - ile split yapip bir array elde edelim [Ali, Can, 11, H, MF]
        // 4- array'in 1.index'indeki soyisme bakip, aranan soyisim ile ayni ise
        //    isim, soyisim, sinif ve sube bilgilerini yazdiralim
        for (String eachValue:ogrenciValueCollection
             ) {
            String [] valueArr=eachValue.split("-");
            String valueSoyIsim=valueArr[1];
            if (valueSoyIsim.equalsIgnoreCase(soyIsim)){
                System.out.println(valueArr[0]+" "+valueArr[1]+
                        " "+valueArr[2]+" "+valueArr[3]);
            }
        }
    }

    public static void sinifListesiYazdir(Map<Integer, String> ogrenciMap, String sinif, String sube) {
        Collection<String> valueCollection=ogrenciMap.values();
        System.out.println("isim soyisim");
        for (String eachValue:valueCollection
             ) {
            String [] valueArr=eachValue.split("-");
            if (valueArr[2].equalsIgnoreCase(sinif)&&valueArr[3].equalsIgnoreCase(sube)){
                System.out.println(valueArr[0]+"  "+valueArr[1]);
            }
        }
    }

    public static Map<Integer, String> numaraIleSubeGuncelleme(Map<Integer, String> ogrenciMap,  int okulNo, String yeniSubeIsmi) {
        // 1- okul numarasini biliyoruz, direk ogrenci value'ye ulasabiliriz

        String ogrenciValue= ogrenciMap.get(okulNo); // Ayse-Can-10-H-MF

        String[] valueArr= ogrenciValue.split("-"); // [Ayse, Can, 10, H, MF]

        // 2- sube ismini guncelleyelim

        valueArr[3]=yeniSubeIsmi; //  [Ayse, Can, 10, M, MF]

        // 3- array'deki guncel bilgileri yeniden value formatinda bir String yapalim

        String yeniValue= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+
                valueArr[3]+"-"+valueArr[4];

        // 4- ogrenci no yani key ile yeni value'yu map'e ekleyelim

        ogrenciMap.put(okulNo,yeniValue);

        return ogrenciMap;
    }
}














package day32_set_maps;

import java.util.*;

public class MapMethodDepo {
    //Bize ogrenciMap donduren bir method olusturun
    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogreciMap = new HashMap<>();

        ogreciMap.put(101, "Ali-Can-11-H-MF");
        ogreciMap.put(102, "Veli-Cem-10-k-TM");
        ogreciMap.put(103, "Ali-Cem-11-K-TM");
        ogreciMap.put(104, "Ayse-Can-10-H-MF");
        ogreciMap.put(105, "Sevgi-Cem-11-K-TM");
        ogreciMap.put(106, "Sevgi-Can-10-H-MF");
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
    public static void subeListesiYazdir(Map<Integer,String>ogrenciMap,String sinif){
        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun

        System.out.println("No isim soyisim bolum");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry: entrySeti
        ) { // 101=Ali-Can-11-H-MF
            // 1- entry'den value'yu alalim
            String entryValue= eachEntry.getValue(); // Ali-Can-11-H-MF
            // 2- bu value'yu parcalayalim ve bir array'e store edelim
            String[] valueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]
            // sinif bilgisini kontrol edip
            // istenen sinif ile ayni ise, istenen bilgileri yazdiralim
            if (valueArr[2].equalsIgnoreCase(sinif)){
                System.out.println(eachEntry.getKey() + " " +
                        valueArr[0] +" "+
                        valueArr[1]+ " "+
                        valueArr[4]);
            }
        }

    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {
        //Verilen bolumdeki ogrencilerin
        //No,isim soyisim ve s??n??flarini yazdiran
        //bir method olusturun
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("=========================");
        Set<Map.Entry<Integer, String>> entrySet = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:entrySet
             ) {
            String entryValue=eachEntry.getValue();
            String [] entryValueArr=entryValue.split("-");
            if (entryValueArr[4].equalsIgnoreCase(bolum)){//[Ali, Can, 11, H, MF]
                System.out.println(eachEntry.getKey()+" " +
                        entryValueArr[0]+" "+
                        entryValueArr[1]+" " +
                        entryValueArr[2]);
            }
        }


    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        //soyisimleri buyuk yap
        Set<Map.Entry<Integer, String>> entrySet = ogrenciMap.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : ogrenciMap.entrySet())
            {
            String[] eachValueArr=integerStringEntry.getValue().split("-");
            eachValueArr[1]=eachValueArr[1].toUpperCase();
            //7-
                integerStringEntry.setValue(eachValueArr[0]+"-"+eachValueArr[1]+"-"+eachValueArr[2]+"-"+eachValueArr[3]+"-"+eachValueArr[4]);
        }

return ogrenciMap;
    }

    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }
    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {
//Map de istedi??imiz degi??klik yapt??ktan sonra map abdate etmenin en kolay yolu set entry.
        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");
        for (Map.Entry<Integer, String> integerStringEntry : ogrenciMap.entrySet())
        {
            String[] eachValueArr=integerStringEntry.getValue().split("-");
            int eachValueArrInt=Integer.parseInt(eachValueArr[2]);

            if (eachValueArrInt==12){
               eachValueArr[2]="Mezun";
            }else {
                eachValueArr[2]=eachValueArrInt+1+"";
            }

            integerStringEntry.setValue(eachValueArr[0]+"-"+
                    eachValueArr[1]+"-"+
                    eachValueArr[2]+"-"+
                    eachValueArr[3]+"-"+
                    eachValueArr[4]);


        }
        return ogrenciMap;
    }

    public static void sinifSiraliListeOlustur(Map<Integer, String> ogrenciMap) {
        // 101=Ali-Can-11-H-MF
        // 11 H Ali Can 101

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal sirali olarak
        // Yazdiran bir method olusturun

        Set<Map.Entry<Integer, String>> entrySeti= ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti= new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entryValue=eachEntry.getValue(); // Ali-Can-11-H-MF

            String[] entryValueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // Entry'den istenen bilgileri alip yeni bir String olusturacagiz
            // ve bu String'leri sirali olarak yazdiracagiz

            String istenenFormattakiBilgi= entryValueArr[2]+" "+
                    entryValueArr[3]+" "+
                    entryValueArr[0]+" "+
                    entryValueArr[1]+" "+
                    eachEntry.getKey();

            siraliOgrenciSeti.add(istenenFormattakiBilgi);
        }

        System.out.println("sinif sube isim soyisim no");
        System.out.println("==========================");

        for (String each : siraliOgrenciSeti) {
           System.out.println(each);

        }


    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        //tum ogrenci listesini isim soyisim no sinif sube bolum
        //seklinde sirali olarak yazdiran method olusturu
        Set<Map.Entry<Integer,String>> entrySeti=ogrenciMap.entrySet();
        Set<String>isimSoyisimSiraliSet= new TreeSet<>();
        for (Map.Entry<Integer, String> eachEntry : ogrenciMap.entrySet()) {
            String value=eachEntry.getValue();
            String[] valueArr=value.split("-");
            String istenenFormattakiBilgi=valueArr[0]+" "+
                                            valueArr[1]+" "+eachEntry.getKey()+" "+
                    valueArr[2]+" "+valueArr[3]+" "+ valueArr[4];

            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);
        }


        System.out.println("isim soyisim no sinif sube bolum");
        System.out.println("==========================");
        for (String each : isimSoyisimSiraliSet) {
            System.out.println(each);
        }

    }

}














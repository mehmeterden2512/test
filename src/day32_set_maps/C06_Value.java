package day32_set_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {

        //Map olustur methodu bize bir map donduruyor
        /*
        biz o class daki mapi kullanmak istiyoruz ama
        her seferinde o classa'a gidip o map'i yeniden olusturmamiz isimize yaramaz.

         */
        //Bu  classda bir map olusuturmak isdtedgimide
        //new HashMapp<>() yaziyoruz
        //
        //bu kodun yerine map
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106, 110]

        System.out.println(ogrenciMap.values());
        //[Ali-Can-11-H-MF, Veli-Cem-10-k-TM, Ali-Cem-11-K-TM, Ayse-Can-10,H-MF, Sevgi-Cem-11-K-TM, Sevgi-Can-10,H-MF, Cemal-Han-12-M-MF]

        //veilen ismin ogrenciMap de olup olmadiğini kontrol edip
        //true vaya false donen bir method olusturun

        boolean sonuc=MapMethodDepo.isimIleOgrenciArama( ogrenciMap,"Ali");
        System.out.println(sonuc);//true
        System.out.println( MapMethodDepo . isimIleOgrenciArama ( ogrenciMap , "Kemal"));//false
        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Cem"));
    }
}

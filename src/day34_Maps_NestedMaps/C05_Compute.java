package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {
        Map<String, Integer> harfSayilariMap = new TreeMap<>();

        harfSayilariMap.put("A", 10);
        harfSayilariMap.put("C", 15);
        harfSayilariMap.put("D", 3);
        harfSayilariMap.put("K", 5);

        System.out.println(harfSayilariMap);
        //A'nin  kullanim miktari 20 yapın
        harfSayilariMap.put("A", 20);

        // C'nin kullanim Miktari iki kati yap
        harfSayilariMap.put("C", harfSayilariMap.get("C") * 2);

        //D'nin miktari 5 artiralim

        harfSayilariMap.compute("D", (k, v) -> v + 5);

        System.out.println(harfSayilariMap);//{A=20, C=30, D=8, K=5}

        //eger Map de T varsa kullanim mik 3 eksiltin

        harfSayilariMap.computeIfPresent("T",(k,v)-> v-3);

        System.out.println(harfSayilariMap);//

        //K varsa kullanimini 2 azaltin
        harfSayilariMap.computeIfPresent("K",(a,b)->b-2);

        //T harfi sayisi yoksa kullanım mik 3 olarak ekle

        harfSayilariMap.computeIfAbsent("T",v->3);// T'nin kullanim mik 3 olarak ekledi
        System.out.println(harfSayilariMap);//{A=20, C=30, D=8, K=3, T=3}
    }
}

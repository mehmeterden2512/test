package day33_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfSayilariniBulma {
    //verilen bir cumlede kulllanılan her bir harfi ve kac kez kullanıldıgını yazdirin
    //orn: Java candir
    //outPut: J=1,a=3,v=1,c=1,n=1,d=1,
    public static void main(String[] args) {
        String cumle = "bu aksam Java da cok tekrar ettim" ;

        //oncelikle bosluk ve noktalam isartleri yok et.
        cumle = cumle.replaceAll("\\W", "");//Javacandir

        String[] cumleArr = cumle.split("");
        Map<String, Integer> kullanimSayilariMap = new TreeMap<>();//siralı olmasını istersek TreeMap onemsiz se hasMap
        for (int i = 0; i < cumleArr.length; i++) {
            //her bir elementi ele alip MAp de key olarak yoksa value=1 olarak ekleriz.
            //map de key olarak varsa value bir artırılmali

            if (!kullanimSayilariMap.containsKey(cumleArr[i])) {
                kullanimSayilariMap.put(cumleArr[i], 1);
            } else {
                int eskiValue = kullanimSayilariMap.get(cumleArr[i]);
                kullanimSayilariMap.put(cumleArr[i], eskiValue + 1);
            }

        }
        System.out.println(kullanimSayilariMap.keySet());
        System.out.println(kullanimSayilariMap);
    }
}

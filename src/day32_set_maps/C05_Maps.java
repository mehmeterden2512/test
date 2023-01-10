package day32_set_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogreciMap=new HashMap<>();

        ogreciMap.put(101,"Ali-Can-11-H-MF");
        ogreciMap.put(102,"Veli-Cem-10-k-TM");
        ogreciMap.put(103,"Ali-Cem-11-K-TM");
        ogreciMap.put(104,"Ayse-Can-10,H-MF");

        System.out.println(ogreciMap);
        //101=Ali-Can-11-H-MF, 102=Veli-Cem-10-k-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10,H-MF}

        System.out.println(ogreciMap.size());//4

        //map 'de 103 numaralı ogrenci var mi?
        System.out.println(ogreciMap.containsKey(103));//true

        //Ali diye bir ogrenci var mi?

        System.out.println(ogreciMap.containsValue("Ali"));//false
        System.out.println(ogreciMap.containsValue("Ali-Can-11-H-MF"));//true
    }
}

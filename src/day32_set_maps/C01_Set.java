package day32_set_maps;

import java.util.*;

public class C01_Set {
    public static void main(String[] args) {
        //Collections,objelerden olusan bir topllugu bir arada tutan yapılardır.
        //Data turu olarak Object secilirse her data turunden element konulabilir.ancak bu durumda elementlere ulasmak
        //onları abdaate etmek gibi işlemler daha zor olabilir. hatta bazen mumkun olmayabilir.
        Set<Object> karisikSet = new HashSet<>();
        karisikSet.add(12);
        karisikSet.add("Java");
        karisikSet.add('S');
        karisikSet.add(false);
       // Iterator itr= karisikSet.iterator();


        int[] arr = new int[3];
        arr[2] = 23;
        arr[1] = 10;
        karisikSet.add(arr);

        List<Object> karisikList = new ArrayList<>();
        karisikList.add("Hava");
        karisikList.add(44);

        karisikSet.add(karisikList);
        System.out.println(karisikList);//[Hava, 44]

        System.out.println(karisikSet);//[[I@48140564, Java, S, false, 12, [Hava, 44]]

        System.out.println(karisikSet.contains(44));//false
        System.out.println(karisikSet.contains(12));//true
        System.out.println(karisikSet.contains(23));//false

        System.out.println(karisikSet.size());//6


        System.out.println(karisikList);


    }
}

package Day18_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler.remove("Z"));// Z yi bulup siler ve görevi tamamladiği icin true döner
        System.out.println(harfler);//[A, T]

        System.out.println(harfler.remove(0));
        //0. index deki elementi siler ve görevi tamamlayip  silinen indexdeki elementi döndürür
        System.out.println(harfler);//[T]

        List<String> yeniList=new ArrayList<>();

        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");
        System.out.println(yeniList.removeAll(harfler));
        //haarfler listesindeki tüm elementleri yeniList'den siler
        //görevi tammamlarsa true yoksa false döner.

        System.out.println(yeniList);//[C, D]
        System.out.println(harfler);//T

    }
}

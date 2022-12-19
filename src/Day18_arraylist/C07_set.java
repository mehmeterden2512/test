package Day18_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {
        //Java da bir cok yapıda get ve set methodlari bulunur.
        //get methodlari bilgiyi bize getirirken set
        //
        //methodlari bilgiyi update(gunceller) eder

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler);//[A, Z, T]

        //2.index'e F elemani ekleyin
        //ad methodu var olan listeden
        // herhangi bir elemneti degistirmeden istedigimiz
        // elemente ekler kalanlari kaydirir

        harfler.add(2,"F");
        System.out.println(harfler);//[A, Z, F, T]

        harfler.set(2,"M");
        System.out.println(harfler);//[A, Z, M, T]
        // set methodu var olan elementin degerini gunceller
        //eleman sayisi artirmaz


    }
}

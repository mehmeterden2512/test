package day31_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        //List data turunde bir LinkedList olusturalım
        List<String> harfeler=new LinkedList<>();

        harfeler.add("H");
        harfeler.add("K");

        System.out.println(harfeler);//

        harfeler.add("H");
        System.out.println(harfeler);

        //1.indexe M ekleyelim
        harfeler.add(1,"M");
        System.out.println(harfeler);

        //2.index deki K yı L yapalım
        harfeler.set(2,"L");
        System.out.println(harfeler);

        List<String> karakterler=new LinkedList<>();
        karakterler.add("*");
        karakterler.add("#");
        karakterler.add("9");
        karakterler.add(2,"M");

        System.out.println(karakterler);//[*, #, M, 9]


        System.out.println(harfeler.retainAll(karakterler));

        System.out.println(harfeler);//[M] ortak elementler dısındaki herseyi sildi

        harfeler.addAll(karakterler);//[M]

        System.out.println(harfeler);//[M, *, #, M, 9]

        System.out.println(harfeler.removeAll(harfeler));//true

        System.out.println(harfeler);//[]

        System.out.println(karakterler.subList(1, 3));//[#, M]

        System.out.println(karakterler);//[*, #, M, 9]

        System.out.println(karakterler.hashCode());//2210822
    }
}

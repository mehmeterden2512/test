package day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        //tum elementleri index kulllanmadan 3 artırın

        System.out.println(sayilar);//[5, 23, 2, 9, 11]
        ListIterator lit=sayilar.listIterator();

        while (lit.hasNext()){
            Integer sayi=(Integer)lit.next();
            lit.set(sayi+3);
        }
        System.out.println(sayilar);//[5, 23, 2, 9, 11]

        //listede ki tum elementleri itrrator kullanarak sondan basa dogru yazdirin.

        //bir ustteki loop ile sona gititiğimiz icin ıterator en sında yani olmasını istediğimiz yerde.
        while (lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
        System.out.println("");
        System.out.println(sayilar);
    }
}

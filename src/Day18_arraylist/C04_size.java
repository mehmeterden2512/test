package Day18_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C04_size {
    public static void main(String[] args) {
        //botutunu ogrenmek
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);//[10, 5, 7, 9]
        System.out.println(sayilar.size());//4
        System.out.println(sayilar.isEmpty());//false

        sayilar.clear();//listedeki tüm elementleri siler

        System.out.println(sayilar.size());//0

        System.out.println(sayilar);//[]
        System.out.println(sayilar.isEmpty());//true
    }
}

package day31_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {
        /*
        verilen bir array daki  tekrar eden elementleri sadece bir kera yazarak
        arrayi kısaltan bir code yazınız
         */
        int[] arr={1,2,3,4,5,1,2,5,3,4,1,2,3,4,5};

        Set<Integer> arrSet=new HashSet<>();

        //arrauydaki tum elementleri Set e ekleyelim.
        for (int each:arr
             ) {
            arrSet.add(each);
        }

        System.out.println(arrSet);//[1, 2, 3, 4, 5] set yaptık array degil

        //Set deki element sayısına esit bir array olusturup
        //Set deki elementleri araya tasıyalim

        arr=new int[arrSet.size()];//[0, 0 ,0 ,0 , 0]
        int index=0;/*
        Set index yapısı kullanmadıgı için burda array da index atama yapabilmek icin.
        Set 1 elemanı bir kere eklediği icin yani aynı oldugunda eski silip yeni ekler
        */
        for (int each:arrSet
             ) {
            arr[index]=each;
            index++;

        }

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
    }
}

package Day18_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_soru {
    public static void main(String[] args) {
        //verilen bir array deki tekrar eden elemnetleri silip
        //array'i unique degerlerden olusan bir array haline ggetirin.

        int[] arr = {4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};


        List<Integer> uniqueBenzersizElemenlerLst=new ArrayList<>();


        //array daki tum elemnetleri alip listede varmi  dşyah kontrol edip liistede  vatmi diye
        //kontrol edelim ve olmayanlari ekleyelim.

        for (int i = 0; i <arr.length ; i++) {
           if (!uniqueBenzersizElemenlerLst.contains(arr[i])){
               uniqueBenzersizElemenlerLst.add(arr[i]);
           }
        }
        System.out.println(uniqueBenzersizElemenlerLst);//[4, 3, 6, 7, 5]

        // soruda bu degerleri arr'ye atamamiz isteniyor

        arr=new int[uniqueBenzersizElemenlerLst.size()];//[0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= uniqueBenzersizElemenlerLst.get(i);
        }

        System.out.println("array son hali : "+ Arrays.toString(arr));//[4, 3, 6, 7, 5]
    }
}

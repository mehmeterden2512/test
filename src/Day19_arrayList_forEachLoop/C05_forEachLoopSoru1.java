package Day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_forEachLoopSoru1 {
    public static void main(String[] args) {

/*
Soru 1- Verilen bir array’de tekrar eden elementler icin,
mukerrer olanlari silip, tum elemanlardan sadece
1 tane yapip eski array’e yeni halini atayip yazdirin.
 */
        Integer[] arr ={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list1=new ArrayList<>();
        for (Integer each:arr
             ) {
           if (!list1.contains(each)){
               list1.add(each);
            }
        }
        arr=new Integer[list1.size()];
        //simdiki listeki elementleri arraya kopyalalım
        // array a atama yapmak icin indexe ihtiyacimiz oldugundan for each kullanmak pratik degil
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=list1.get(i);
        }
        System.out.println("arrayin yeni hali"+ Arrays.toString(arr));
    }
}

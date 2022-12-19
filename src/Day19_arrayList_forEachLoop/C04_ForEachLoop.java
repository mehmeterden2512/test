package Day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        Integer[] arr ={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list1=new ArrayList<>();


        for (Integer each:arr
             ) {
            list1.add(each);
        }

        System.out.println(list1);

        //array daki cift sayilari olusturacagimiz listeye tasiyalim
        List<Integer> ciftSayilarList1=new ArrayList<>();

        for (Integer each:arr
             ) {
            if (each%2==0){
                ciftSayilarList1.add(each);
            }
        }
        System.out.println(ciftSayilarList1);

    }
}

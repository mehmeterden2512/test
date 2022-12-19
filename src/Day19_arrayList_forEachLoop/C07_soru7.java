package Day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_soru7 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip,
        ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.
         */
        int[] arr1 = {3,5, 6, 1, 3, 7};
                int arr2[]={3,8,9,4,5,11};
        List<Integer> ortakElementler=new ArrayList<>();
        for (int eacharr1:arr1
             ) {
            for (int eacharr2:arr2
                 ) {
                if (eacharr1==eacharr2){
                    if (!ortakElementler.contains(eacharr1)){
                        ortakElementler.add(eacharr1);
                    }
                }
            }
        }
        System.out.println(ortakElementler);
    }
}

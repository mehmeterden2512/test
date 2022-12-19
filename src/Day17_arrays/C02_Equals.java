package Day17_arrays;

import java.util.Arrays;

public class C02_Equals {
    public static void main(String[] args) {
         int[] arr1={3,8,0};

         int[] arr2={8,3,0};
        System.out.println(Arrays.equals(arr1, arr2));//False

        //equals methodu hem elementleri hem de indexleri kontrol eder
        //ayni indexlerde ayni elementler varsa true ,yoksa false döner

        //eger siralamadan dolayi false donmesini istemiyorsak
        //önce iki array i de sort yapabiliriz.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));//true

    }
}

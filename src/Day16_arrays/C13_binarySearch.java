package Day16_arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {
        //binary tree Javanin kullandigi ozel bir siralama yontemdir
        //binarySearch methodu binary tree ozelligini kullandigindan sirali olmayan sonuclarda dogru sonuc dondurmeyebilir
        //eger binarySearch kullanilacaksa MUTLAKA sort() kullanilmalidir.
        int[] arr={2,6,9,3,15,1,7};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 6, 7, 9, 15]

        System.out.println(Arrays.binarySearch(arr, 3));//2
        System.out.println(Arrays.binarySearch(arr,1));//0
    }
}

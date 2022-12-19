package Day16_arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {
        // verilen bir array'i Natural order'a gore sıralayiniz.

        String[] isimler={"Hüseyin","Yusuf","Mehmet","Akile","Said","Mahmut","ahmet","adnan"};
        System.out.println(Arrays.toString(isimler));//[Hüseyin, Yusuf, Mehmet, Akile, Said]
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Akile, Hüseyin, Mahmut, Mehmet, Said, Yusuf, adnan, ahmet]

        //Eger buyukten kucuge sıralamak istersek ,once sort kullanarak natural order'a gore sıralar
        //Sonra gecici bir array kullanarak siralamyi terse ceviririz.


    }
}

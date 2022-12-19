package Day16_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        //verilen bir string array'in tum elementlerini yazdirin.
        String[] isimler={"Hüseyin","Yusuf","Mehmet","Akile","Said"};

        System.out.println(Arrays.toString(isimler));//[Hüseyin, Yusuf, Mehmet, Akile, Said]

        for (int i = 0; i <isimler.length ; i++) {

            System.out.print(isimler[i]+" ");//Hüseyin Yusuf Mehmet Akile Said

        }


    }
}

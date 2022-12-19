package Day17_arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {

        String str="Java her gecen gun guzellesiyor";

        //str' da kac kelime var?

        String[] spaceSplit=str.split(" ");

        System.out.println(Arrays.toString(spaceSplit));//[Java, her, gecen, gun, guzellesiyor]

        System.out.println("verilen cümledeki kelime sayisi "+spaceSplit.length);

        System.out.println(Arrays.toString(str.split("e")));//[Java h, r g, c, n gun guz, ll, siyor]

        System.out.println(Arrays.toString(str.split("gun")));//[Java her gecen ,  guzellesiyor]

        System.out.println(Arrays.toString(str.split("")));//[J, a, v, a,  , h, e, r,  , g, e, c, e, n,  , g, u, n,  , g, u, z, e, l, l, e, s, i, y, o, r]


    }
}

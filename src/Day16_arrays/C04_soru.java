package Day16_arrays;

import java.util.Arrays;

public class C04_soru {
    public static void main(String[] args) {
        //verilen bşr String Array'da istenen bir harfi iceren kelimeleri silip yerine null yazdirin
        String[] isimler={"Hüseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf="u";

        for (int i = 0; i < args.length ; i++) {
            if (isimler[i].contains(silinecekHarf)){
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler));//[Hüseyin, Yusuf, Mehmet, Akile, Said]
    }
}

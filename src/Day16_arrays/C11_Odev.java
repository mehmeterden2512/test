package Day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {
        // Kullanıcıdan yeni isimler alıp, var olan bir array'e ekleyen bir method oluşturun.
        //Kullanıcı yeni değer verdiği müddetçe, C10'daki methodu kullanarak eklemeye devam edin,
        // kullanıcı Q'ya bastığında array'in son halini döndürün.
        String[] arr = {"ayse", "fatma", "hasan"};
        System.out.println(Arrays.toString(yeneEklenmisArray(arr)));
    }

    public static String[] yeneEklenmisArray(String[] mevcut) {
        Scanner scan = new Scanner(System.in);
        System.out.println("eklemek istediginiz ismi girin bitirmek istediginizde \"q\" ya basin");
        String isim = scan.nextLine();
        mevcut = C10_ArrayeElementEkleme.arrayeElementEkleme(mevcut, isim);
        while (!isim.equalsIgnoreCase("q")) {
            System.out.println("eklemek istediginiz ismi girin bitirmek istediginizde \"q\" ya basin");
            isim = scan.nextLine();
            if (!isim.contains("q") || isim.contains("Q")) {
                mevcut = C10_ArrayeElementEkleme.arrayeElementEkleme(mevcut, isim);
            } else {
                break;
            }

        }

        return mevcut;
    }
}
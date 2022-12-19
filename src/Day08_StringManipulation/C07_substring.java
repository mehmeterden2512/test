package Day08_StringManipulation;

import java.util.Locale;

public class C07_substring {
    public static void main(String[] args) {

        String str="java ogren, isi kap";

        System.out.println(str.length());//karakter sayisi:19
//
        //Metnin tam ortasindaki karakter nedir
        System.out.println(str.charAt(str.length()/2));//n

        //son karakteri yazdir
        System.out.println(str.charAt(str.length()-1));//p

        // bir karakteri degil de verilen stringin icerdigi
        // metin paarçasını elde etmek istersek
        // ornegin: "ogren" kelimesini yazdiralim

        System.out.println(str.substring(5,9));

        //substring(bas,bitis)method'unda
        //baslangıc olarak yazılan index dahil(inclusive)
        //bitis olarak

        System.out.println(str.substring(5,10));

        //str'dan "java" kelimesini yazdiralim
        System.out.println(str.substring(0,4));
        // str'dan kap" yazdiralim


        System.out.println(str.substring(16,19));//kap
        System.out.println(str.substring(16));//kap
        System.out.println(str.substring(str.length()-3));//kap

        //substring kullanarak sadce "j" harfini yzdirin
        System.out.println(str.substring(0));//java ogren, isi kap
        System.out.println(str.substring(0,1));//j
        //substring kullanarak 9.indeks teki harfi buyuk harfle yazdirin
        System.out.println(str.substring(9,10).toUpperCase());//n
        System.out.println(str.toUpperCase().charAt(9));//n
        //charAt() kullanmak yerine substring kullanmak daha avantajli olabilir
        // cunku substring kullaninca ifade hala string oldugundan
        //  method kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5));//hiçlik(boş)
       // System.out.println(str.substring(4,3));//StringIndexOutOfBoundsException
        //System.out.println(str.substring(25,28));//StringIndexOutOfBoundsException
        System.out.println(str.substring(str.length()-1));
        //System.out.println(str.charAt(str.length()));//StringIndexOutOfBoundsException
       // System.out.println(str.substring(str.length()+1));//StringIndexOutOfBoundsException
        System.out.println("=========");
    }
}

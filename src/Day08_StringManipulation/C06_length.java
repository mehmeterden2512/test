package Day08_StringManipulation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str="java her gecen gun daha da guzellesiyor, degil mi?";

        // sondan üçüncü karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));

        System.out.println(str.length());//50


        Random rnd=new Random();//rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturur
        int index= rnd.nextInt(str.length());//str.length()'den kucuk rastgele bir int uretir
        System.out.println(str.charAt(index));




    }
}

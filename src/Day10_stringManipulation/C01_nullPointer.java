package Day10_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1="";
        String str2="    ";
        String str3;
        String str4=null;
        System.out.println(str1.length());//0
        System.out.println(str2.length());//4
        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());//false
        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());//true
        // null bir deger degil isaretcidir(null pointer)
        //null pointer non primitive bir objenin olusturuldugunu ancak
        //bilincli olarak deger atanmadigini isaretler
        // str 'un degeri null'dir demek yanlis
        // str4 null olarak isaretlenmistir cümlesi dogru
        //System.out.println(str3.length());
        //System.out.println(str3.concat("Ali can"));
        /*
        Java bir variable olusturup deger atanmamasina izin verir
        bir variable deger atamadan olusturabilirsiniz ancak kullanamazsiniz
        deger atanmayan bir variable kullanmaya kalkarsaniz
        Java CTE verir.
        null pointer ise bu variable'a deger atanmadigini
        ve bunun bilincli bir tercih oldugunu bilir
        ancak deger atanmadigi icin method'lar ile kullanmaya kalkarsaniz
        NullPointerException verir.

         */

        str4=null;
        //System.out.println(str4.length());//NullPointerException
        //System.out.println(str4.substring(3, 4));//NullPointerException
        System.out.println(str4);//null
        System.out.println(str4+"Ali Can");// nullAli Can
        System.out.println(str4.concat("Ali Can"));//NullPointerException



    }
}

package Day08_StringManipulation;

public class C03_equals {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String str4="Ja";
        String str5=str4.concat("va");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str5);

   /*
== string için beklediğimiz sonuçlari vermeyebilir
cunku hem metnin degerini hem de objenin refaaransini karsilastirir
bunu ilerde anlatacaz
Java'da String objelerinin metinlerinin ayni olup olmadigini kontrol etmek için
== yerine equals method' KULLANILMALIDIR
 */
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str5));//true



    }
}

package Day08_StringManipulation;

public class C04_equalsignorCase {
    public static void main(String[] args) {

        String str1="Pazar";
        String str2="PAZAR";
        String str3="pazar";
        String str4="PaZaR";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        /*
        Eger iki metni KARSILASTIRIRKEN buyuk kucuk harf duyarliligi(case sensitive)
         önemsz ise o zaman
         equalsignorCase() kullanilir
         */
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));








    }
}

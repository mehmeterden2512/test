package Day08_StringManipulation;

import java.util.Locale;

public class C02_touppercaseLocale {
    public static void main(String[] args) {
        String str="JAVA CANDIR";
        System.out.println(str.toLowerCase());//java candir

str=str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
        str= "sevgi insanı hayata bağlar";
        System.out.println(str.toUpperCase());//SEVGI INSANI HAYATA BAĞLAR
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));



    }
}

package day03_DataCasting_wrapperClass_Matematikselislemler;

public class C07_Modules {

    public static void main(String[] args) {


        // % Modulus : java'da bolme islemi sonucunda kalan sayiyi verir
        System.out.println(15 % 4 ); // 3
        System.out.println(45 % 4); // 1
        /* kullanicinin girdigi deger cift sayi mi ?
           girilenSayi % 2 isleminin sonucu 0 ise cift sayidir
           kullanicinin girdigi sayi 7'nin kati mi ?
           girilensayi % 7 isleminin sonucu 0 ise 7'nin katidir
           kullanicinin girdigi sayinin birler basamagi
           kullanici 3426 girdi
         */
        int girilenSayi=3426;
        int birlerBasamagi= girilenSayi % 10; // 6
        System.out.println("birler basamagi : " + birlerBasamagi);
        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi); // 342
        birlerBasamagi= girilenSayi % 10; // 6
        System.out.println("birler basamagi : " + birlerBasamagi);
        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi); // 342
        birlerBasamagi= girilenSayi % 10; // 6
        System.out.println("birler basamagi : " + birlerBasamagi);
        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi); // 342
        birlerBasamagi= girilenSayi % 10; // 6
        System.out.println("birler basamagi : " + birlerBasamagi);
        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi); // 342

    }
}

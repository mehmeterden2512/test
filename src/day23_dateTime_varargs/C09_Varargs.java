package day23_dateTime_varargs;

public class C09_Varargs {
    public static void main(String[] args) {
           /*
        Argument olarak tam sayilar alıp son argument haric geriye kalanlari toplayip
        son argument  ile carpip
        sonucu yazdiran bir method olusturun
        Not: argument sayisi degişken olabilir

         */
       // islemYap(3,4,5,5,7);
        /*
        Varargs sınırsız sayıda element alma ozelliğine sahiptir dolayısıyla
        varargs olarak tanımlanan bir parametre den sonra parametre kullanirsaniz
        CTE olusur
        Cunku varargs tum argumenleri almak ister
        budurumda sonraki parametreye element kalmaz

          KURAL : Bir method'da parametre olarak varargs kullanilacaksa
                  son parametre olarak kullanilmalidir.

                  Bu kural gozonune alindiginda bir method'da
                  parametre olarak birden fazla varargs KULLANILAMAZ

                  Parametrelerin data turunun degismesi bu kurali etkilemez
         */

    }
    /*
    private static void islemYap( int...geriyeKalanlar,int sonSayi) {

        int geriyeKalanlarToplami=0;

    }

     */

}

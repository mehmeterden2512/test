package day03_DataCasting_wrapperClass_Matematikselislemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
/* Eger genis kapasiteli bir data turunden dar kapasiteli bir data turune
           casting yapmak isterseniz
           Java bunu otomatik olarak gerceklestirmez, sizden sorumluluk almanizi bekler
           islemin gerceklesmesi icin cast yapmak istediginiz degerin onunde
           (donusturmek istedimiz data turu) yazilmalidir

           Explicit narrowing yapildiginda data kayiplari
           veya datanin beklenmedik bir sonuca donusmesi mumkundur
*/
        double dbl=23.5;
         int sayi=(int)dbl;
        System.out.println(sayi);
        byte byt=(byte)sayi;
        System.out.println(byt);
        sayi=130;
        byt=(byte) sayi;
        //int daha kapsamlı oldugu icin otamatik yapmaz mudahale ıster
        System.out.println("int 130'un byte hali:"+byt);
        sayi=255;
        byt=(byte) sayi;
        //int daha kapsamlı oldugu icin otamatik yapmaz mudahale ıster
        System.out.println("int 255'un byte hali:"+byt);
        sayi=13000;
        byt=(byte) sayi;
        //int daha kapsamlı oldugu icin otamatik yapmaz mudahale ıster
        System.out.println("int 1300'un byte hali:"+byt);



    }
}

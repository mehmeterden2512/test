package day22_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_passByValue {
    public static void main(String[] args) {

            // verilen bir List'de degisiklik yapan 2 method olusturun
            // 1.method list'in elementlerine yeni deger atayip yazdirsin
            // 2.method, list'e yeni bir list degeri atayip, yeni list'e
            //   elementler ekleyip yazdirsin
            // her iki method'u cagirdiktan sonra main method'daki list'i yazdiralim
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
                sayilar.add(45);
        System.out.println(sayilar);//

        elemanlarDegistir(sayilar);//elemnalari degistir method'unda list :[25, 54, 67]

        System.out.println("1.Method call'dan sonra sayilar : "+sayilar);//[25, 54, 67]

        yeniListAta(sayilar);//yeni list ata methodunda sayilar list son hali :[34, 98, 11]

        System.out.println("2. method call dan sonra sayilar :"+sayilar);//2. method call dan sonra sayilar :[25, 54, 67]
        /*Java PassByValue kullanir
        PassByValue, method'a gonderilen variable'in kendisini degil degerini gondermek demektir.
        primitive data turleri veya String gonderdigimizde, method'da yapilan degisiklik method'da kalir.
        main method'da atama yapilmadikca main method'daki variable'in degeri DEGISMEZ
        PassByValue coklu element iceren array ve list gibi yapilar icin de GECERLIDIR
        Ancak coklu elementi value olarak method'a gonderemediginden
        array veya list'in adresini gonderir.
        Eger method'da elementlere atama yapilirsa, main method'daki elementler de degismis olur
        Eger list veya array'e yeni bir list veya array degeri atanirsa bu atama method'da kalir,
        main method'daki list veya array degismez.
        Araba ayni kaldigi muddetce icindekilerin degismesi passByValue'e aykiri degildir.
                */
    }
    public static void elemanlarDegistir(List<Integer> sayilar){
        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemnalari degistir method'unda list :"+sayilar);

    }

    public  static void yeniListAta(List<Integer> sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("yeni list ata methodunda sayilar list son hali :"+sayilar);

    }
}

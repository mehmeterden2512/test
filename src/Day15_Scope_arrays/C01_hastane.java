package Day15_Scope_arrays;

import day14_DoWhileLoop.Hastane;

public class C01_hastane {
    static String hastaneIsmi="Yıldız Hastanesi";
    static  String hastaneAdres="Cankaya/Ankara";
    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        /*
        eger tum methpdlardan kullanilabilecek methodlar olusturmak isterseniz
        bu variable'lari class level da olustururuz
        Class Level da olusturulacak variable'lar icin 2 ihtimal vardir
        1-static variable(class variable)
        2-instance(static olmayan)variable(obje variable)
        Kural1-static variable'lar tum objeler icin tek bir deger alir
                instance variable'lar her obje icin java tarafindan cogaltilir
         Kural2-class level variable'lara degerr atamasak da kullanabiliriz
         biz deger atamasak bile java class level variable'lara default degerler atar
         non-primitive==>null(String)
         sayisal primitive==>0
         char==>hiclik ""
         boolean==>false
         Kural3-stacic olan methodlardan stacic olmayan variable ve method'lara direk ulsılmaz
                instance variable ve static olmayan method'lari static olanlardan kullanmak isterseniz
                obje uzerinden kullanabilirsiniz

          Kural4- class'da olusturulan instance variable'lar ilk deger atamasini yapar
                  yani bir obje ilk olusturuldugunda otomatik olarak instance variable'a atanan degeri alir
                  deger atanmamissa default degerleri alir
                  obje olusturulduktan sonra obje uzerinden yapilan atamalar
                  class level'daki instance variable'a degil, java tarafindan olusturulup
                  objeye yapistirilan kopya variable'a yapilir
        Kural5-static variable'lar tum objeler icin ortaktir
        static variable'lara tum class'tan ulasılabilir
        static variable'ın degeri degisirse tum objeler icin degisir

         */
        C01_hastane per1=new C01_hastane();

        System.out.println(per1.personelIsmi) ;//null
        System.out.println(per1.personelAdresi);//null
        System.out.println(per1.personelTel);//null
        per1.personelIsmi="Fidan";
        per1.personelAdresi="Germany";
        per1.personelTel="+49172548552";


        C01_hastane per2=new C01_hastane();
        System.out.println(per2.personelIsmi);//null

        per1.personelIsmi="Yusuf";
        System.out.println(per2.personelIsmi);//null
        per2.personelIsmi="Ayten";
        System.out.println(per2.personelIsmi);//Ayten
        System.out.println(per1.personelIsmi);//Yusuf

        System.out.println();

    }
    public static void method1(){
        System.out.println(hastaneAdres);
    }

    public void method2(){
        System.out.println(hastaneIsmi);
    }

}

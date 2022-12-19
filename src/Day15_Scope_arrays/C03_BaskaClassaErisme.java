package Day15_Scope_arrays;

public class C03_BaskaClassaErisme {
    public static void main(String[] args) {

        /*
        java OOP konsept cercevesinde baska class'lardaki uyelerini(variable) kullanabiliriz
        Baska class'daki herhangi bir class uyseine erismek istedgimizde
        static keyword onemli bir rol oynar
        static olarak isaretlenen class uyelerine
        classIsmi.staticuyeIsmi seklinde ulasabiliriz
        static olmayan class uyelerine ulasmak icin obje olusturmamız gerekir

        Java runtime prohram'dir
        basinca calisir, calistigi surece yapilan islemler KALİCI olarak tutar
        calisma bittiginde HER SEY YOK OLUR
         */
        System.out.println(C01_hastane.hastaneAdres);//Cankaya/Ankara
        C01_hastane.method1();//Cankaya/Ankara
        System.out.println(C01_hastane.hastaneIsmi);//Yıldız Hastanesi

        C01_hastane per1=new C01_hastane();

        System.out.println(per1.personelAdresi);//null
        System.out.println(per1.hastaneIsmi);//Yildiz
        per1.personelIsmi="Belkis";
        per1.personelAdresi="İstanbul";
        per1.hastaneAdres="Uskudar";

        System.out.println(per1.personelIsmi);

        System.out.println(per1.personelAdresi);//İstanbul

        System.out.println(per1.personelTel);//null

        System.out.println(per1.hastaneIsmi);//Yildiz
        System.out.println(per1.hastaneAdres);//Uskudar


    }
}

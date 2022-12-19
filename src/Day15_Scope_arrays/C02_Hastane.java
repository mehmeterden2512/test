package Day15_Scope_arrays;

public class C02_Hastane {
    static String hastaneIsmi="Yıldız Hastanesi";
    static  String hastaneAdres="Cankaya/Ankara";
    String personelIsmi="Personel";
    String personelAdres="Adres";
    String personelTelefon="Telefon";

    public static void main(String[] args) {
        C02_Hastane per1=new C02_Hastane();

        C02_Hastane per2=new C02_Hastane();

        per1.personelIsmi="Harun";

        per2.personelAdres="Cankaya";

        per1.hastaneIsmi="Java Hastanesi";

        System.out.println(per1.personelTelefon);//Telefon
        System.out.println(per1.personelIsmi);//Harun
        System.out.println(per2.personelIsmi);//Personel
        System.out.println(per2.personelAdres);//Cankaya
        System.out.println(per1.hastaneIsmi);//Java
        System.out.println(per2.hastaneIsmi);//Java

        per1.personelIsmi="Mehmet";
        System.out.println(per1.personelIsmi);//mehmet
        System.out.println(per2.personelIsmi);//Personel
    }
}

package day14_DoWhileLoop;

public class Hastane {
    static String hastaneIsmi="Yıldız Hastanesi";
    static  String hastaneAdres="Cankaya/Ankara";
    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        Hastane p1=new Hastane();//defoult degeri olarak null degeri atar
        p1.personelIsmi="Kemal";
        Hastane p3=new Hastane();
        p3.personelTel="31212323222";//baslangıcta null alarak atadigini telefon numarasi olarak degistirir.

    }


}

package day23_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        //Kactane String argument yazılırsa yazilsin argumentlerin
        // en uzun olani yazdiran bir method olusturun
        //Not: en uzun kelime olarak birden fazla kelime varsa ,ilkini yazdir

        enUzunuYazdir("Ilyas","Berivan","Murat");

        enUzunuYazdir("Mehmet","Vahit","Nurcan","Java","Zafer");//Mehmet

    }

    private static void enUzunuYazdir(String... kelimeler) {

        String enUzunKelime=kelimeler[0];

        for (String eachKelime:kelimeler
             ) {
            if (enUzunKelime.length()>enUzunKelime.length()){
                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime);

    }
}

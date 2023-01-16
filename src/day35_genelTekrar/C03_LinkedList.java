package day35_genelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    //verilen bir link liste
    // istenen iki index deki elementlerin yerlerini degistirin
    public static void main(String[] args) {
        LinkedList<String> isimler=new LinkedList<>();

       isimler.add("Sait");
       isimler.add("Huseyin");
       isimler.add("Hasan");
       isimler.add("Sevilay");
       isimler.add("Humeyra");

       //hasan ile humeyranın yerlerini degiştirelim
        //buyuk bir listede index bilmeden yapalım
        System.out.println(isimler);
        String ilkIsim="Hasan";
        String ikinciIsim="Humeyra";


                isimler.set(isimler.indexOf(ikinciIsim),ilkIsim);
                isimler.set(isimler.indexOf(ilkIsim),ikinciIsim);
        System.out.println(isimler);



    }
}

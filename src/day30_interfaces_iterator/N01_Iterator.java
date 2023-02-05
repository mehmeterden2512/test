package day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println(sayilar);
        //index yapısını kullanmadan tum elemenleri 3 artirin

        for (Integer each:sayilar
             ) {
            each=each+3;
            System.out.print(each+" ");

        }

        System.out.println();
        System.out.println(sayilar);
        //index yapısını kullanmadantum elementleri yazdırın
        Iterator itr=sayilar.iterator();

        System.out.println(itr.next());//5

        System.out.println(itr.next());//23

        System.out.println(itr.next());//2

        System.out.println(itr.next());//9

        System.out.println(itr.next());//11

        //tek tek yapmayum loop ile yapalım


        System.out.println(itr.hasNext());//false

        //iterator de geri donus yok
        //iterator nereye gittiyse orada kalir,geri dönemez
        //tum liste ile yeniden yazdirmak icin yeniden bir itr olusturmali veya
        //itr 'a yeni deger atamalıyız.
        itr=sayilar.iterator();

        System.out.println(itr.hasNext());//true

        while (itr.hasNext()){//yanda adam varmı varsa yazdir ve yana gec :)
            System.out.print(itr.next()+" ");
        }



        //iterator kullanarak 5'den buyuk sayıları silin

        itr=sayilar.iterator();
        while (itr.hasNext()){
            Integer sayi=(Integer) itr.next();
            if (sayi>5){
                itr.remove();
            }
        }
        System.out.println("");
        System.out.println(sayilar);//[5, 2]




    }
}

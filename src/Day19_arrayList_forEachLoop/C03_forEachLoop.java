package Day19_arrayList_forEachLoop;

public class C03_forEachLoop {
    public static void main(String[] args) {
        /*
        eger coklu elemnet iceren bır yapıdak tum elmentlere
        ayni islemi yapmak istiyorsak index den bagimsiz olarak for each loop kullanilabilir
        for each loop da 3 seyi belirtmemiz gerekir
        1-getirilecek elmentlerin data turu
        2-getirilen elemente verilecek isim(genelde each veya /w kullanilir)
        3-nereden getirelecegi
         */


        int[] arr={2,4,6,8,1};
        //bu  array'in elmentlerini yazdiralim
        for (int each:arr
             ) {
            System.out.print(each+" ");
        }
        System.out.println("");
        //tum elemnetleri toplayalim
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;
        }
        System.out.println("sayilarin toplami: "+toplam);


        //tum sayiların karelerini toplayalim
        toplam=0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("sayilarin kareler toplami: "+toplam);
    }
}

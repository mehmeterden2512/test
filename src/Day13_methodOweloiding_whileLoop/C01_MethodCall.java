package Day13_methodOweloiding_whileLoop;

import Day12_methodCreation.C03_asalSayiMi;
import Day12_methodCreation.C07_TerseCEvirme;
import Day12_methodCreation.C09_FibonocciDizisi;

public class C01_MethodCall {
    public static void main(String[] args) {
        //ilk 15 fibonacci sayisini yazdirin
        C09_FibonocciDizisi.fibonaccidenSayiYazdir(15);

        //asagida verilen cumleyi tersine cevir
        String str="Bir kere yaparim, yan gelir yatarim";
        String tersStr=C07_TerseCEvirme.metniTerseCevir(str);
        System.out.println(tersStr);//miratay rileg nay mirapay erek riB
        // asagida verilen cumlenin palidrome olup olmadigini yazdirin
        str="Java Candir";
        tersStr=C07_TerseCEvirme.metniTerseCevir(str);
        if (tersStr.equals(str)){
            System.out.println("polindrome");
        }else {
            System.out.println("polindrome degil");
            //
            // asagida verilen sayinin asal sayi olup olmadigini yazdirin

            int sayi=23;
            System.out.println(C03_asalSayiMi.asalSayiMi(sayi));//true
            //kullanici true false dan bir sey anlamaz,acik sekilde yazariz
            boolean sonuc=C03_asalSayiMi.asalSayiMi(sayi);
            if (sonuc){
                System.out.println("girilen "+sayi+" asal");
            }else {
                System.out.println("girilen "+sayi+ " asal sayi degil");
            }


        }


    }
}

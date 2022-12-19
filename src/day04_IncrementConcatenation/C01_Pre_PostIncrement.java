package day04_IncrementConcatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {
        int sayi=20;
        //sayiyi 3 artirin
         sayi=sayi+3;
         sayi+=3;

         sayi++;
         sayi++;
         sayi++;
        System.out.println(sayi);//29
        //  sayinin degerini 2 azalt
        sayi=sayi-2;
        sayi-=2;
        sayi--;
        sayi--;
        System.out.println(sayi);


        sayi=10;
        //sayi 1azalt ve yazdir
        sayi--;
        System.out.println(sayi);//9
        // buislemde gördugumuz 9 sayi degeri 9
        sayi=10;
        //sayiyi yazdir,sonra 1 azalt
        System.out.println(sayi);//10
        sayi--;
//ekranda gorulen 10, ama sayını degeri :9
        sayi=10;
        System.out.println(sayi++);
        //Java ayni satirda iki islem oldugunddan sıralama yapar
        //eger++ variable'dan sonra ise artirma islemini yapar
        //bu durumda once yazdırma sonra artırma islemini yapar
        System.out.println(sayi);
        sayi=10;
        System.out.println(++sayi);
        //++ variable'dan once ise artırma islemini once yapar
        //bu durumda once artırma sonra yazdırma islemi yapar
        System.out.println(sayi);
    }
}

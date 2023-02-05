package day36_genelTekrar;

import java.util.Scanner;

public class C01_RecursiveMethods {

    //kullanıcidan pozitif bir sayi alıp
    //o sayidan sıfıra kadar olan sayilari toplayın
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir tam sayi girin");
        int sayi=scan.nextInt();
        toplaForloop(sayi);
        System.out.println("recursive toplam: "+toplaRecursive(sayi));

    }

    private static int toplaRecursive(int sayi) {
        //recursive method cagırma anlatımı ekran goruntusu alındı:)
       if (sayi>0){
           return (sayi+toplaRecursive(sayi-1));
       }else {
           return sayi;
       }
    }

    private static void toplaForloop(int sayi) {
        int toplam=0;
        for (int i = 0; i <=sayi ; i++) {
            toplam+=i;
        }
        System.out.println("sayilar toplami : "+toplam);
    }
}

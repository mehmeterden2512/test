package Day10_stringManipulation;

import java.util.Scanner;

public class c09_ForLoop {
    public static void main(String[] args) {
        //kullanicidan baslangic ve bitis degerlerin alip bu
        // sınırlar dahil olarak bu sayilar arasinda 5 'in kati olan sayilari
        //yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("baslangic degerini giriniz");
        int baslangic=scan.nextInt();
        System.out.println("bitis degerini girin");

        int bitis=scan.nextInt();
        for (int i = baslangic; i <=bitis ; i++) {
            if(i%5==0){
                System.out.println(i+" ");
            }

        }

    }
}

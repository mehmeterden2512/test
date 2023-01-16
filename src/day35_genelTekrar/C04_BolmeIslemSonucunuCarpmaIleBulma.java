package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {
    public static void main(String[] args) {
        //kullanicidan bolunecek sayi ve bolecek sayi alıp
        //bolme işlem  sonucunu ,carpma işlemi ile bulan ve yazdiran bir method olusturun
        //bu işlemi kullanici Q 'ya basincaya kadar devam ettrin

        Scanner scan=new Scanner(System.in);
        boolean devamEdelimmi=true;
        int bolunecekSayii=1;
        int bolenSayi=1;


        do {
            System.out.println("lutfen bolunecek tam sayi girin\nbitirmek icin Q' ya basin");
            try {
                bolunecekSayii=scan.nextInt();
                System.out.println("bolecek sayi yi giriniz");
                bolenSayi=scan.nextInt();
                bolumSonucunuYazdir(bolunecekSayii,bolenSayi);
            } catch (InputMismatchException e) {
                String girilenStr=scan.nextLine();//21.satirda degeri alamazsa exception olusaacak bu satira gelecek biz o degeri nextline() ile alacaz
                if (girilenStr.equalsIgnoreCase("q")){
                    devamEdelimmi=false;
                }else {
                    System.out.println("Bolunecek sayi tamsayi olmalıdir");
                }
            }
        }while (devamEdelimmi);


    }

    private static void bolumSonucunuYazdir(int bolunecekSayii, int bolenSayi) {

        //boluneccek sayi ve bolen sayi negatif veya poazitif olabilir
        //bu duermda öncelikle işaret kontrolu yapmamiz lazim
        //isaret sorunu cozmek icin
        // once işlem sonucunu işaretini  belirleyip
        // sonra sayişlari işarettten bagımsız hale getirelim
        int sonucIsareti=1;
        if (bolunecekSayii*bolenSayi<0){
            sonucIsareti=-1;
        }
        // sonra sayişlari işarettten bagımsız hale getirelim
        bolunecekSayii=bolunecekSayii>=0 ?bolunecekSayii :bolunecekSayii*(-1);
        bolenSayi=bolenSayi>=0?bolenSayi:bolenSayi*(-1);
        int bolumSonucu=1;
        while (bolumSonucu*bolenSayi<=bolunecekSayii){
            bolumSonucu++;
        }
        bolumSonucu--;
        System.out.println("bolum sonucu: "+bolumSonucu*sonucIsareti);
    }
}

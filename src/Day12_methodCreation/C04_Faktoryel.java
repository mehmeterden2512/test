package Day12_methodCreation;

public class C04_Faktoryel {
    public static void main(String[] args) {
        //verilen bir sayinin 15'den kucuk bir tam sayi oldugunu kontrol edin
        // kucukse bir method olusturup ,faktoryel degerini yazdirin

        int input=23;
if (input>0&&input<15){
    faktoryelYazdir(input);
}else {
    System.out.println("girilen sayi 15'ten kucuk pozitif tamsayi olmalıdir");
}


    }
    public static void faktoryelYazdir(int sayi){
        int faktoryelSonucu=1;
        for (int i = sayi; i >=1 ; i--) {

        }
        System.out.println("girilen"+sayi+"faktoryel sonucu:"+faktoryelSonucu);
    }

}

package Day10_stringManipulation;

public class C10_ForLoop {
    public static void main(String[] args) {

        //input olarak verilen sayidan baslayarak 7'şer 7'şer
        //artirarak input olarak verilen bir-tis sayisana kadar
        //tüm sayilari
        //kac adet sayi oldugunu
        // ve busayilarin toplamini  yazdirin
        int inputBas=37;
        int intputBit=563;
        int sayac=0;
        int toplam=0;


        for (int i = inputBas; i <=intputBit ; i+=7) {

            System.out.println(i+" ");
            sayac++;
            toplam+=i;
        }
        System.out.println("");
        System.out.println("Toplam:"+sayac+"adet sayi var\nBu sayilarin toplami:"+toplam);
    }
}

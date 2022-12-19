package Day10_stringManipulation;

public class C08_ForLoop {
    public static void main(String[] args) {

        //1 ile 1000 arasindaki sayilari(sınrlar dahil) yan yana yazdirin
        //yazdirma islemi bittiğinde
        //tüm bunsayilarin toplami=" deyip sayilari toplamini yazdirin
        int sayilarinToplami=0;

        for (int i = 1; i <=1000; i++) {
            System.out.println(i+" ");
            //sayilarinToplami=sayilarinToplami+i;
            sayilarinToplami+=i;


        }
        System.out.println("");
        System.out.println("tüm sayilarin toplami="+sayilarinToplami);
    }
}

package Day07_ternarySwitchStatements;

public class C06_ternary {
    public static void main(String[] args) {
//kullanicidan notunu alın
        //50 veya dah büyükse "sınıfı geçtin
        //50 'den küçükse maalesef kaldin
        int input=44;
        System.out.println(input>=50?"sınıfı geçtin":"maalesef kaldin");

   //Soru 3- Kullanicidan bir harf isteyin, girilen karakter
        // kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

   char karakter='a';
        System.out.println(karakter>='a'&&karakter<='z'?(char)(karakter-32):karakter);

//Soru-6 bir sayi al mutlaka değeri yaz

        int intput=5;
        System.out.println(input>0?input:(-1)*input);



    }
}

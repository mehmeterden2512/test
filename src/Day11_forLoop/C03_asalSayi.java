package Day11_forLoop;

public class C03_asalSayi {
    public static void main(String[] args) {
        //input olarak verilen bir tamsayinin
        //asaal sayi omadigini yazdirin
        int input=4737;
        String sonuc="Sayi asal";
        for (int i = 2; i <input; i++) {

            if (input%i==0){
                sonuc="asal sayi degil";
                break;


                //JAva,bir loop icerisinde "break"gorurse
                //o loop'u bitirir
            }

        }
        System.out.println(sonuc);
    }
}

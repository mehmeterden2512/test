package Day07_ternarySwitchStatements;

public class C03_ternary {
    public static void main(String[] args) {
        //in put olarak verilen sayi kontrol edip sayi çift sayi
        //çift sayi
        //değilse çift sayi yazdirin
        int input=33;
        // ifelse
        if (input==0){
            System.out.println("çift sayi");
        }else {
            System.out.println("tek sayi");
        }
//ternary
        System.out.println(input%2==0?"çift sayi":"Teksayi");


    }
}

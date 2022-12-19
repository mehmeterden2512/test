package Day07_ternarySwitchStatements;

public class C05_ternary {
    public static void main(String[] args) {
        /*
        ternary işleminin sonucunu yazdiracaksak boolean şartın
        true veya false olmasi durumunda yazdiracağimiz datalar farkli data türünde olabilir
        ancak atama yapacaksak true veya false olmasi durumunda alacaği değerler  atayacağimiz data türüne uygun olmalıdır
        ,
         */
        int sayi=2;
        System.out.println(sayi>10?"buyuk sayı":sayi+2);
       // int b=sayi>10?"buyuk sayi":sayi+2;
       //String c=sayi>10?"buyuk sayı":sayi+2;


    }
}

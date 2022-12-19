package Day13_methodOweloiding_whileLoop;

public class C03_Method_overloading {
    public static void main(String[] args) {
        toplama(5.4,6.3);//2 double sayi toplami :11.7

        toplama('a','b');//int ve double toplami :195.0

        //ilk olaralk yüzde yuz uyumlu parametreler arar
        //%100 uyumlu yoksa calisabilecek method var mi diye kontrol eder
        //calisack method bir den fazla olursa minumum casting yaparak kullanacagini tercih eder

        toplama(8.4,6);//2 double sayi toplami :14.4

    }

    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double toplami :" + (sayi1+sayi2));
    }
    public static void toplama(double sayi1, double sayi2){
        System.out.println("2 double sayi toplami :" + (sayi1+sayi2));
    }

}

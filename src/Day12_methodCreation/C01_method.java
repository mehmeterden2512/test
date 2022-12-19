package Day12_methodCreation;

public class C01_method {
    public static void main(String[] args) {
        String str=".java da yolu yariladik";

        str.isEmpty();//bloolean sonuc ama kullanmadik
        //methodu dondurdugu sonucu kullanmak isterseniz ya yazdirirsiniz


      str.isBlank();//false
         //method'lar bazen cok basit islemleri ,bazen de komlekx islemleri yapabilir
        //biz o islemleri nasil yapabiliriz diye dusunmek yerine hazir method'u kullanmayi tercih ederiz
        //bizden sonra kodu inceleyecek kisiler de hazir method isimlerinden ne yapmak istedigimizi kolayca
        //ayrica kodu her yazdigimizda yapabileecegimiz muhtemel hatalardan kurtulmus oluruz

        System.out.println(str.isBlank());//false
        //  ya da donen sonucu ilerde kullanacaksak atama yapabiliriz

        String buyukHarfHali=str.toUpperCase();



    }
}

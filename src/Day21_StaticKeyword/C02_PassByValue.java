package Day21_StaticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {

         /*
        Java PassByValue kullanir
        Yannni method'lar arasinda gonderilen variable'larin
        kendileri degil, value'lari diger method'a yollanir.
         */


        int fiyat=100;
        //fiyat uzeinden %10 indirim yapip ,indirimli fiyati donduren bir method olusturun

        System.out.println(indirimliFiyat10(fiyat));

        System.out.println(fiyat);//100

        //eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istersek atama yapariz

        fiyat=indirimliFiyat10(fiyat);


    }
    public static int indirimliFiyat10(int fiyat){
        fiyat=fiyat*90/100;
        return fiyat;
    }
}

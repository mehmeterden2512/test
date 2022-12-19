package Day16_arrays;

public class C06_soru {
    public static void main(String[] args) {
        //bir marketin fiyatlarini tutan bir array var
        // bu marketteki en yuksek ve endusuk fiyatlari yazdiran bir method olusturun

        double[] fiyatlar={23,34.5,42.1,5.7,3.4,23.5};
        enYuksekEnDusukFiyat(fiyatlar);

    }
    public static void enYuksekEnDusukFiyat(double[]fiyatlar){
        double enDusukFiyat=fiyatlar[0];//karsılastırmak icin rastgele birini aldık
        double enYuksekFiyat=fiyatlar[0];

        for (int i = 0; i <fiyatlar.length ; i++) {
            if (fiyatlar[i]<enDusukFiyat){
                enDusukFiyat=fiyatlar[i];
            }
            if (fiyatlar[i]>enYuksekFiyat){
                enYuksekFiyat=fiyatlar[i];
            }
        }
        System.out.println("listedeki en dusuk fiyat: "+enDusukFiyat+"\nlistedeki en yüksek fiyat: "+enYuksekFiyat);
    }
}

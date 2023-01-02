package day25_inheritance;

public class BDoktor extends APersonel {
     /* Olusturdugumuz Doktor class'inda isim soyisim gibi
        Personel class'inda olusturulan tum ozelliklerin olmasini istiyoruz
        Bu durumda 2 tercih var
            1- istenen tum ozellikleri Doktor class'inda yeniden olusturabilirsiniz
            2- Doktor class'ini Personel'in child'i yapmak
        Doktor class'ini Persdonel classs'inin child'i yaptigimizda
        Doktor class'indan olusturulan objeler
        sadece kendi class'larindaki ozelliklere sahip olmaz
        ayni zamanda parent class'i olan personel'deki
        ozelliklere de sahip olurlar
        Bir child class'dan obje olusturdugumuzda
        o objenin ozelliklerini belirlerken
        once kendi class'ina bakilir ve o ozellik varsa kullanilir
        eger kendi class'inda yoksa parent class'a bakilir
        Bir class extends keyword kullanarak baska bir class'i
        kendisine parent edinirse
        1- parent class'daki tum ozellikleri direk kullanabilir
            (isim,soyisim,telefon,ozelSgorta)
        2- Isterse parent class'da olan bir ozelligi kendisine uyarlayabilir
            (maas)
        3- Isterse parent class'da olmayan kendisine ozel yeni ozellikler olusturabilir
            (nobet)
     */




    public static void main(String[] args) {
        BDoktor doktor1=new BDoktor();
        doktor1.isim="Kemal";
        doktor1.soyIsim="Bulut";
        System.out.println(doktor1.isim+","+doktor1.soyIsim+","+doktor1.telefon);
        doktor1.maas();
        //doktor maası 30*8*25:6000
        doktor1.ozelSigorta();
        //tum personel ozel saglık sigortasi yaptırılır
        doktor1.nobet();//doktorlar haftada bir nobet tutar
    }
    public void maas(){
        System.out.println("doktor maası 30*8*25 "+6000);
    }
    public void nobet(){
        System.out.println("doktorlar haftada bir nobet tutar");
    }
}

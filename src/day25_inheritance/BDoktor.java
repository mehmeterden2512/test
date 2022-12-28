package day25_inheritance;

public class BDoktor extends APersonel {
    /*
    //*olsuturdugumuz doktor class'inda isim soyisim gibi
    //*Personel class'ında olusturulan tum ozelliklerin olmasini istiyoruz
    //*bu durumda 2 tercih var
        1-istenen tum ozellikleri Doktor class'inda yeniden olusturabilirsin
        2-Doktor classi'ini personel child i yapmak;

        doktor classini personel clasının child yaptıgımızda
        Doktor classından olusturualn objeler sadece kendi clasında ki ozelliklere
        sahip olmaz aynı zaman da parent class i olan personel deki
        ozelliklere de sahip olurlar



     bir child class'dan obje olusturdugumuzda o objenin ozelliklerini
     belirlerken once kendi classina bakilir...

     Bir class extends keyword kullanarak baska bir class'i
     kendisine parent edinirse
     1-...
     2-...
     3-...



     */




    public static void main(String[] args) {
        BDoktor doktor1=new BDoktor();
        doktor1.isim="Kemal";
        doktor1.soyIsim="Bulut";
        System.out.println(doktor1.isim+","+doktor1.soyIsim+","+doktor1.telefon);
        doktor1.nobet();//doktorlar haftada bir nobet tutar
    }
    public void maas(){
        System.out.println("doktor maası 30*8*25 "+6000);
    }
    public void nobet(){
        System.out.println("doktorlar haftada bir nobet tutar");
    }
}

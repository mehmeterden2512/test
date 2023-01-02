package day25_inheritance;

public class APersonel {

 protected    String isim="isim atanmadi";
 protected    String soyIsim="soy isim atanmadi";
 protected    String telefon="Telefon atanmadi";
protected void maas(){
    System.out.println("hastanede uygulanan asgari ucret"+1700);
}
protected void ozelSigorta(){
    System.out.println("tum personel ozel saglık sigortasi yaptirilir");
}
private void privateMethod(){
    System.out.println("private method calıştı");
}
}

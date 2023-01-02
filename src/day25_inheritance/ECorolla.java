package day25_inheritance;

public class ECorolla extends DToyota {
    ECorolla(){
        System.out.println("Paramatresiz coralla Constructor'i calıştı");
    }
    ECorolla(String param1){
        super("Gri");
        System.out.println("String parametreli constructor calıştı");
    }
    String model="Coralla";
    String  uretimYeri="Turkiye";

    public static void main(String[] args) {
        ECorolla cor1=new ECorolla("Mavi");

    }
     /*
        Bir obje olusturuldugunda ilk deger atamasi yapilabilmesi icin
        constructor calismalidir.
        Inheritance'da biliyoruz ki
        chiild class'dan olusturulan her obje
        parent class'daki ozelliklere de sahip olur
        Parent class'daki ozelliklere sahip olabilmesi icin
        parent class'daki constructor'lar da calismalidir.
        Java bu calismayi super() sayesinde saglar
        Java'da her olusturulan class'da gorunmese de default constructor oldugu gibi
        extends keyword kullanilan her class'da olusturulan her constructor'in
        ilk satirinda gorunmese de super() vardir
     */
}

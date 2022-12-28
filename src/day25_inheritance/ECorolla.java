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
    Bir obje olusturuldugınd a ilk deger atamasi yapilabilmesi icin
    constructor calısmalidir....


   java bu calışmayi super() constructor call sayesinde saglar.
   Java da her olusturulan classta gorunmese de default constructor oldugu gibi extends keywordu kullanılan
   her clas'da olusturulan super() vardir.
     */
}

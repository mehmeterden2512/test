package day26_inheritance;

 class Okul{
    String okulIsmi="Yildiz koleji";
    String telefon="3123456543";

}

public class C01_Sinif extends Okul {

     String sinif="11-C";
     String telefon="3122343434";

     C01_Sinif(String telefon){
         System.out.println(telefon);
         System.out.println(this.telefon);//this.aramaya clastan basla demek ***konsol**3122343434
         System.out.println(super.telefon);//super.aramaya parentdan basla****konsol**3123456543

         System.out.println(okulIsmi);
         System.out.println(this.okulIsmi);//this.aramaya clastan basla demek
         System.out.println(super.okulIsmi);

         System.out.println(sinif);
         System.out.println(this.sinif);//this.aramaya clastan basla demek
         //System.out.println(super.sinif);//Java da parent da
         // bulamadiğini gidip child sorayim olmaz.dolayisiyla parent da sinif olmadiğindan CTE verir.

     }

    public static void main(String[] args) {
        C01_Sinif obj=new C01_Sinif("4222342323");
    }

}

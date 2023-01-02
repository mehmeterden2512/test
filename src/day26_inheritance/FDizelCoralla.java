package day26_inheritance;

public class FDizelCoralla extends ECorolla {

String motor="1.6 dizel motor";
String yakit="Dizel";
String guvenlik="Abs";
String renk="renk belirtilmedi";


    public static void main(String[] args) {
        DToyata c3=new FDizelCoralla();
        System.out.println(c3.motor);//T "Motor belirtilmedi"
        System.out.println(c3.yakit);//T "yakıt belirtilmedi"
        //System.out.println(c3.guvenlik);//CTE burada mantık toyota classina git var mı bak?
       // System.out.println(c3.renk);//CTE

        System.out.println(c3.model);//T Model Belirtilmedi
        //System.out.println(c3.uretimYeri);//CTE
        //System.out.println(c3.teker);//CTE
       // System.out.println(c3.vites);//CTE


        System.out.println(c3.marka);//T

          /*
   bazen child class dan obje olusturmaakla beraber
   bu child class'ın parent class'inda ki hangi
   ozelllikleri aldıgını
   bilmek isteriz.
   Bu durumda data turunu constructor'i kullanilan class'in
   parent class'lardan secebiliriz.
    */
        ECorolla c2=new FDizelCoralla();//Data turu ile constructor ayri DİKKAT. variable olarak tanımlıyoruz


        System.out.println(c2.motor);//motor belirtilmemis
        System.out.println(c2.yakit);//yakit belirtilmemis
        //System.out.println(c2.guvenlik);//CTE
        //System.out.println(c2.renk);//CTE

        System.out.println(c2.model);//C
        System.out.println(c2.uretimYeri);//C
        System.out.println(c2.teker);//C
        System.out.println(c2.vites);//

        FDizelCoralla c1=new FDizelCoralla();
        System.out.println(c1.motor);//1.6 dizel
        System.out.println(c1.yakit);//Dizel
        System.out.println(c1.guvenlik);//DC
        System.out.println(c1.renk);//DC **hangi classtan alıyor

        System.out.println(c1.model);//C
        System.out.println(c1.uretimYeri);//C
        System.out.println(c1.teker);//C
        System.out.println(c1.vites);//C


        System.out.println(c1.marka);//T





    }
}

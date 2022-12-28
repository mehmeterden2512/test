package day25_inheritance;

public class DToyota extends CCar{
    DToyota(){
        System.out.println("Parametresiz toyota constructor'i calıstı");
    }
    DToyota(String param1){
        System.out.println("paramtereli toyata constructor calıştı");
    }
    String marka="Toyata";
    String uretimYeri="toyata farklı ulkelerde uretilir";
}

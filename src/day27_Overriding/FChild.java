package day27_Overriding;

public class FChild extends EParent{
    @Override
    protected void method1() {
        super.method1();
        /*
        eger overrriding method ile birlikte overriden method da calıssın isterdsek
        ovwerriding method icinden super.method1(); yazabiliriz
         */
    }

    @Override
    protected void method2() {
        super.method2();
    }
    public void method3(){
        System.out.println("Child method3");
        //parent class da aynı isimde method olmasına ragmen override olarak gorulmedi
        //sebep:parent da ki method3 private access modifier a sahip oldugunndan
        //onu ayrı bir method olarak gorur,override olarak görmez
    }
}

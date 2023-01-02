package day27_Overriding;

public class EParent extends DGrandParent {


    @Override
    protected void method1() {
        System.out.println("P method1");
        /*
        @override notasyonu overridden method ile overriding method u ile ilişiklendirir
        eger overriden method'da bu ilşikiyi bozacak
         */

    }

   protected void method2(){

        System.out.println("P method2");
    }
    private  void method3(){
        System.out.println("P method3");
    }

}

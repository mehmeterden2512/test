package day02_variables_scanner;

public class C03_nonPrimitiveDataTypes {
    public static void main(String[] args) {
        String str="Java candir";
        int sayi= 10;
        /*primitive data turlerinin hazir method'lari yoktur ancak non primitive
        data türlerinin hazir methodlari vardir.*/
        System.out.println(sayi);
        System.out.println(str.toLowerCase());//java candir(str.toLowerCase)anlık degisim yapar

        System.out.println(str);//Java candir yazdirir.

        System.out.println(str.toUpperCase());//JAVA CANDIR
        System.out.println(str.isEmpty());//false


    }
}

package Day08_StringManipulation;

public class C05_iqualsignorCase {
    public static void main(String[] args) {

        String str="Java guzeldir";//13 karakter barindirir
        // java da index 0' dan baslar
        //J==0.index,r==>12
        //charAt(index) ile istedigimiz index' deki
        // char'a ulasabiliriz

        // ilk a' yi yazdiralim
        System.out.println(str.charAt(1));

        //sondan 2.harfi yazdiralim
        System.out.println(str.charAt(13-2));
        //sondan 4. karakteri buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().charAt(13-4));
        //charAt() method'u bize char dondurdugu icin touppercase calısmaz
        //String method'larini charAt() ile kullanmak isterseniz
        //charAt()2den once kullanmalisiniz

        // System.out.println(str.charAt(13)); // StringIndexOutOfBoundsException
        // Eger index olarak karakter sayisi veya daha buyuk bir deger girersek
        // o index'i bulamayacagi icin hata verir




    }
}

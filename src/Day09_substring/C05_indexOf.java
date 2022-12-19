package Day09_substring;

public class C05_indexOf {
    public static void main(String[] args) {

        String str="Java ile kodlama cok kolay";

        // str cok iceriyor mu?
        System.out.println(str.contains("cok"));//true

        // kullanicidan aldıgımız cumle "cok" ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.indexOf('a'));//1

        System.out.println(str.indexOf("v"));//2

        System.out.println(str.indexOf("cok"));//cok paketi hangi index ile basliyor 17

        System.out.println(str.indexOf("a", 5));//13

        //2.o'nun indexini yazdirin
        // once ilk o nun indexini buluruz
        // sonra o index'den sonrasindaa ikinci o'o yu aratiriz

       int ilkOindexi=str.indexOf("o");//11
        int ikinciOindexi=str.indexOf("o",ilkOindexi+1);
        System.out.println(ilkOindexi+" "+ikinciOindexi);



    }
}

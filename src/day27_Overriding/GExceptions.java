package day27_Overriding;

public class GExceptions {
    public static void main(String[] args) {
        int a =23;
        int b=0;

        //bolen sayının sıfır olması bu code da ongorulecek bır rısk tır ve
        //kodumuzu yazarken bu riski cozecek sekilde kode yazbiliriz

        if (b!=0){
            System.out.println("iki sayının bolumu : "+ a/b);
        }else {
            System.out.println("bolecek sayı sıfır olamaz");
        }
    }
}

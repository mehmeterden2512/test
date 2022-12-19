package Day06_ifElseStatements;

import java.util.Scanner;

public class C03_ifElseStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf
        // olarak yazdirin, yoksa girilen harfi yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter girin");
        char harf=scan.next().charAt(0);

        if (harf>='a'&&harf<='z'){
            System.out.println((char)(harf-32));
            System.out.println(Character.toUpperCase(harf));
        }else{
            System.out.println(harf);
        }






    }
}

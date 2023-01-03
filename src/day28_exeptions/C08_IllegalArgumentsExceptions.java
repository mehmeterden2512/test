package day28_exeptions;

import java.util.Scanner;

public class C08_IllegalArgumentsExceptions {
    public static void main(String[] args) {

        //Kullanıcıdan yasini girmesini isteyin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasınızı girin");
        int yas=scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException("hata");
            }else {
                System.out.println("yasınız kaydedildi");
            }
        } catch (IllegalArgumentException e) {
                e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}

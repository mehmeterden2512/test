package day28_exeptions;

import java.util.Scanner;

public class C05_MultipleExceptions {
    public static void main(String[] args) {
        /*
        Eger birden fazla exception olusma ihtimali varsa
        bu exceptionlar birbirinden bagımsız ise
         1- tek try istenen kadar catch yapilabilir
         2- ikisi icin ic ice try catch yapabilirim
         3- iki exception'i da kapsayan tek bir catch yapabilirim
         */
        String str="java da cok fazla exception var";
        int[] arr={3,5,1,3,2,6,3,6,8,5,2};

        //kullanıcıdan bir tam sayi alin
        //ve girilen sayiyi index  olarak kullanıp
        // str ve arrr'den indexi elementleri yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir index girin");
        int index=scan.nextInt();
       // System.out.println("String den istenen index'deki element: "+str.substring(index,index+1));
        //System.out.println("Arry'den istenen index'deki element : "+arr[index]);
       /* //1.cozum

        try{
            System.out.println("String den istenen index'deki element: "+str.substring(index,index+1));
            System.out.println("Arry'den istenen index'deki element : "+arr[index]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("istenen index string dısında");

        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("istenen index arrray in dısında");
        }

        */
        /*//2.cozum ic ice try catch


        try {
            try {
                System.out.println("String den istenen index'deki element: "+str.substring(index,index+1));
                System.out.println("Arry'den istenen index'deki element : "+arr[index]);
            } catch (Exception e) {
                System.out.println("istenen index string dısında");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("istenen index arrray in dısında");
        }

         */
        //3.cozum tek ama kapsamlı bir exception kullanma
        try {
            System.out.println("String den istenen index'deki element: "+str.substring(index,index+1));
            System.out.println("Arry'den istenen index'deki element : "+arr[index]);
        }catch (RuntimeException e){
            System.out.println("index String ve/veya Arrayin sınırları dısında ");
            e.printStackTrace();
        }
    }
}

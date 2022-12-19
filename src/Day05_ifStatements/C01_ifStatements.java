package Day05_ifStatements;

import java.util.Scanner;

public class C01_ifStatements {
    public static void main(String[] args) {

        //öğrenciden notunu rakam olarak aldırın harf olarak yazdırın
        //0-49,999  ff
        //50-64,9999  cc
        //65-84,9999  bb

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu girin" );
        double not=scan.nextDouble();
        if(0<=not&&not<50){
            System.out.println("notunuz DD,maalesef kldiniz");
        }if (50<=not&& not<65){
            System.out.println("notunuz CC,tebrikler gectiniz");
        }  if (65<=not&&not<85){
            System.out.println("notunuz :BB");
        }if (85<=not&& not<=100){
            System.out.println("tabrikler notunuz:AA");
        }
}}

package Day21_StaticKeyword;

import java.util.ArrayList;
import java.util.List;

public class C01_StaticBlocks {
   C01_StaticBlocks(){
       System.out.println("constructor calisti");
   }

    public static void main(String[] args) {
        System.out.println("main method calismaya basladi" );
    }
    static {
       //Static blocklar class'daki tüm yapilardan,hatta main method dan bile once calisir
       //Static blockta istedigimiz bir variable baslangic degeri atnmasi kullanicidan yetki sorgulamasi gibi
        //methodlar ve static bloklarin siralamasi java acisindan önemli degildir
       // ancak birden fazla sstatic block varsa kendi aralarinda once ustteki calısir

        System.out.println("yukardaki Static block calısti");
    }
    static {
        System.out.println("alttaki static block calisti");


    }

}































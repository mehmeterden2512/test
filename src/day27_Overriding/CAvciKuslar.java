package day27_Overriding;

public class CAvciKuslar extends BKuslar {
    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ){
        System.out.println(" et yerler ");
    }
    protected void pence( ){
        System.out.println("pencelidirler");
    }
    protected void  gaga( ){
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvciKuslar krt1=new CAvciKuslar();

        krt1.hareket();//C classından alacak
        krt1.beslenme();//C

        krt1.pence();//C pencelidirler
        krt1.gaga();//C sivri gagali

        krt1.kanat();//B classından alacak kanatlidirlar
        krt1.solunum();//B akcigerle nefes alirlar
        krt1.cogalma();//B yumurtayla cogalirlar
        krt1.omur();//A yasar ve olurler
        /*
        eger constructor ile data turu aynı ise ozelligin variable veya method olmasına bakılmaksızın o classa' a
        gidilir,o class veya parent class'larda bulunan ILK DEGER kullanılır
         */


        BKuslar krt2=new CAvciKuslar();

        krt2.hareket();//C (classından alacak) ucarlar
        krt2.beslenme();//C  et yerler

        //krt2.pence();//Bkuslar veya parent class da yok ,CTE verir
        krt2.gaga();//C sivri gagali pencelidirler

        krt2.kanat();//B classından alacak kanatlidirlar
        krt2.solunum();//B akcigerle nefes alirlar
        krt2.cogalma();//B yumurtayla cogalirlar
        krt2.omur();//A yasar ve olurler

        AHayvanlar krt3=new CAvciKuslar();

        krt3.hareket();//C  ucarlar classından alacak yani override edilmis mi constructor oldugu classa kadar bakacak
        krt3.beslenme();//C et yerler

       // krt3.pence();//C AHayvanlarda yok ,CTE
        // krt3.gaga();//C  AHayvanlarda yok ,CTE

       // krt3.kanat();//B AHayvanlarda yok ,CTE
        krt3.solunum();//B akcigerle nefes alirlar
        krt3.cogalma();//B yumurtayla cogalirlar
        krt3.omur();//A yasar ve olurler






    }
}

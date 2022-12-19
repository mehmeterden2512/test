package Day10_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java ogren, adana ye :)";
        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replace(" ",""));

        String telefon="555 3451234";
        System.out.println(telefon.replace("555","532"));//532 3451234


    //10 binden fazla oldugunu test et
        String sonuc="1-16 of over 100,000 results for “apple”";
        int indexOver=sonuc.indexOf("over");
        int indexResults=sonuc.indexOf("results");
        String sonucSayisiStr=sonuc.substring(indexOver+5,indexResults-1);
        sonucSayisiStr=sonucSayisiStr.replace(",","");
        int sonucSayisiInt=Integer.parseInt(sonucSayisiStr);//string 100000'i int 100000 e cevirir
        if (sonucSayisiInt>10000){
            System.out.println("arama sonuc testi PASSED");
        }else {
            System.out.println("Arama sonuc testi failed");//arama sonuc testi PASSED
        }




    }
}

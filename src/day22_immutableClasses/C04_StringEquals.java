package day22_immutableClasses;

public class C04_StringEquals {
    public static void main(String[] args) {
        /*
        Java Stringlerde her seferinde yeni obje olusturmak icin

        String havuzu kullanir

        eger string olustururken bugune kadar yaptiğimiz gibi basit bir sekilde
        olusturulursa havuza kontrol eder
        ve ayni deger varsa bunlari ozdeslestirir

        ancak new keyword kullanilir veya bir islem sonucun da String elde edilirse havuza bakmaz ,
        obje yi olusturur sonra atama yapar.


         */
        String str1="Java";
        String str2="Java";
        String str3=new String("Java");

        String a="Ja";
        String b= "va";
        String str4=a+b;
        String str5=a.concat(b);

        String str6=str5+"";

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true
        System.out.println(str1.equals(str6));//true
        System.out.println(str1.equals("Java"));//true
        //equals:sadece degerlere bakar
        System.out.println("===========");

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false
        System.out.println(str1==str5);//false
        System.out.println(str1==str6);//false
        System.out.println(str1==("Java"));//true
        System.out.println(str2=="Java");//true

        //== hem degere hem referance bakar
    }
}

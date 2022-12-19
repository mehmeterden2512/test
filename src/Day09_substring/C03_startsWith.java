package Day09_substring;

public class C03_startsWith {
    public static void main(String[] args) {

        String str="Java mutluluktur";
        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith("j"));//false

        System.out.println(str.startsWith("Java mutluluktur"));//true

        System.out.println(str.startsWith(""));//true

        System.out.println(str.contains("mutlu"));//true içerir?
        System.out.println(str.startsWith("mutlu"));//false baslar?

        System.out.println(str.startsWith("mutlu", 5));//true 5.indeks ve sonrasi mutlu ile baslar

        System.out.println(str.startsWith("va",2));//true 2.indeks ve sonrasi

        System.out.println(str.startsWith("v",2));//true

    }
}

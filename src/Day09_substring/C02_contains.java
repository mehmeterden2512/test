package Day09_substring;

public class C02_contains {
    public static void main(String[] args) {

        String str="Java ogren, mutlu ol";
        //str mutlu iceriyor mu?
        System.out.println(str.contains("mutlu"));//true

        //charScquence:char dizisi

        System.out.println(str.contains("j"));//false
        System.out.println(str.contains(""));//false

        //contains method'u kactane olduguna degil,
        // sadece var olup
        //olmadıgına bakar

        System.out.println(str.contains("Java") && str.contains("mutlu"));




    }
}

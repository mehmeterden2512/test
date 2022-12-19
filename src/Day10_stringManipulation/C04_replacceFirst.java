package Day10_stringManipulation;

public class C04_replacceFirst {
    public static void main(String[] args) {
    String str="Java heyecandir";
    // eger a lari degil de sadece ilk a yi degistirmek isterseniz
        System.out.println(str.replaceFirst("a","A"));

        //ilk harf veya rakami * yap
        System.out.println(str.replaceFirst("\\w","*"));
                                                    //"\\w" harf ya da rakam

    }
}

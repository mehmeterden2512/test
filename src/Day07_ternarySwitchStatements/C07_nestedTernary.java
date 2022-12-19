package Day07_ternarySwitchStatements;

public class C07_nestedTernary {
    public static void main(String[] args) {
        //ullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift
        // sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli
        // degil seceneklerinden uygun olani yazdirin


        int sayi=-555;

        System.out.println(sayi>0
                ?
                (sayi%2==0?"sayi çift":"sayi tek")
                :
                -100>=sayi&&sayi>=-999?"3 basamaklı":"3 basamkli değil");

    }
}

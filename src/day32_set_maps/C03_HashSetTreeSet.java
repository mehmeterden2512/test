package day32_set_maps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_HashSetTreeSet {
    public static void main(String[] args) {
        /*
        Bİr hashSet ve TreeSet olusturun bir loop ile ıclerine rastgele 100000 sayi ekleyip
        islem surelerini karsılastırın.

         */
        Random rnd=new Random();
        int sayi;

        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();

        Long hashBaslangic=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            sayi= rnd.nextInt(1000000);
            hashSet.add(sayi);
        }
        Long hashBitis=System.currentTimeMillis();

        Long treeBaslangic=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            sayi= rnd.nextInt(1000000);
            treeSet.add(sayi);
        }
        Long treeBitis=System.currentTimeMillis();

        System.out.println("HashSet sure= "+(hashBitis-hashBaslangic));
        System.out.println("TreeSet sure= "+(treeBitis-hashBaslangic));
    }
}

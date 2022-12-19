package Day21_StaticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {
    public static void main(String[] args) {


        int[] arr={3,6,9,1,7};



        //bir method olusturup arr i methoda yollayalim methodda array in elemntleri uzerinde
        // Array in elemntleri uzerinde degisiklik yap ve array i yazdir


        elementleriDegistir(arr);//[13, 6, 9, 1, 7]

        System.out.println(Arrays.toString(arr));//[13, 6, 9, 1, 7]


    }
    public static void elementleriDegistir(int[] b){

        b[0]=13;
        b[2]=9;

        System.out.println(Arrays.toString(b));

    }
}

package Day21_StaticKeyword;

import java.util.Arrays;

public class C06_PassByValueCokluElemment {
    public static void main(String[] args) {

        int[] arr={3,6,8};



        //bir method olusturun methodda array 5 elementli yeni bir array atayin ve yazdirin
        //main methodda dondukten sonra yin e array yazdirin,
        arrayiDegistir(arr);//[0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));//[3, 6, 8]

    }
    public static void arrayiDegistir(int [] b){
        b=new int[5];

        System.out.println(Arrays.toString(b));

    }
}

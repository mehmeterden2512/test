package Day16_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] arr1=new String[4];//[null,null,


        int[] arr2={3,4,5,6,7,8};

        System.out.println(arr2[2]);//5

        System.out.println(arr1[3]);//null

       // System.out.println(arr1[8]);//ArrayIndexOutOfBoundsException

        arr2[2]=15;
        arr2[0]=7;

        //tum array' yazdiralim
        System.out.println(arr2);//[I@48140564

        //array'in tamamını yazdirmak icin Arrays'indan yardim alırsınız

        System.out.println(Arrays.toString(arr2));//[7, 4, 15, 6, 7, 8]

        System.out.println(Arrays.toString(arr1));//[null, null, null, null]


    }
}

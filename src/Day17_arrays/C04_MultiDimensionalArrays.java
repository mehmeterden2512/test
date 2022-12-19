package Day17_arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//4

        System.out.println(arr[2][1]);//7

        System.out.println(arr[3]);//[I@48140564

        //multiDimensionalArray ile calişirken dikkat etmemiz gereken en onemli konu
        //yazdigimiz kodun bir array mi yoksa yazdirabilecegimiz bir element mi dondurdugudur.

        System.out.println(Arrays.toString(arr[3]));//[2]

        //19.satirdaki 2 elementini yazdirmak istersek
        System.out.println(arr[3][0]);//2
        //MDA 'in tumunu yazdirmak isterseniz
        // tek katli araylari yazdirmak icin  kullanmadiginiz yontem yeterli olmaz
        System.out.println(Arrays.toString(arr));//[[I@58ceff1, [I@7c30a502, [I@49e4cb85, [I@48140564, [I@2133c8f8]

        System.out.println(Arrays.deepToString(arr));//[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]

    }
}

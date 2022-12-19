package Day16_arrays;

import java.util.Arrays;

public class C09_ArrayeYeniDegerAtama {
    public static void main(String[] args) {
        int[] arr1={1,2,3};

        // arr1={3,6,1,8}; degistiremeyez
        // arr1={5,7,8};//aynı uzunlukta olsa bile degişsmez
        //arr1= new int[5];//eskiyi sill yenisini point et

        System.out.println(Arrays.toString(arr1));//[0, 0, 0, 0, 0]
        //14. satirdaki atam a ile Java arr1'in pointerini eski array'den silip new
        // keyword ile olusturdugumuz yeni array'e yonlendirir

        // eski elementleri de korumak istersek
        // ozaman atama yapmadan once yeni array i hazirlamaliyiz
        //bunun icin bos yeni bir array olusturup eski arraydaki
        //elementleri yeni array'e tasiyip
        //sonra atama yapmaliyiz

        int[] temp=new int[5];

        for (int i = 0; i <arr1.length ; i++) {
            temp[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));
        arr1=temp;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));

    }
}

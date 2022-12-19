package Day13_methodOweloiding_whileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {

        //2 basamakli sayilardan 7 ile bolunebilenleri uazdirin

        for (int i = 10; i <100 ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        //ayni soru while loop
       int sayi=10;

        while (sayi<100){
            if (sayi%7==0){
                System.out.print(sayi+" ");
            }
            sayi++;
        }
        //forloop ile yapilacak bir soruyu illa da while ile yapmak
        // biraz zahmetli

    }
}

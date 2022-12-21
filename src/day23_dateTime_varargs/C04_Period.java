package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1992,2,10);
        LocalDate bugun=LocalDate.now();

        Period yas=Period.between(dogumTarihi,bugun);

        System.out.println(yas);//P30Y10M10D(30yıl10ay10 gun)yasinda
        System.out.println(yas.getYears());//30

        LocalDate baslangic=LocalDate.of(2010,8,5);
        LocalDate bitis=LocalDate.of(2015,7,20);

        Period sure=Period.between(baslangic,bitis);
        System.out.println(sure);//P4Y11M15D  acıklama: 4yıl11ay15gun

    }
}

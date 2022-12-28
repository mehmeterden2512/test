package day24_StringBuilder;

import day25_inheritance.APersonel;

public class FChildOfPersonel extends APersonel {
    public static void main(String[] args) {
        FChildOfPersonel obj1=new FChildOfPersonel();
        System.out.println(obj1.isim);
       //obj1.private();
       //child class olsa da parent methoda ulaşamaz
    }
}

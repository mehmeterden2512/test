package day28_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedExceptions {
    public static void main(String[] args) {

        //metin txt dosyasındaki yazıları yazdiralim

        /*
        eger birden fazla catch cumlemiz varsa ve exceptionlar arasında
        parent-child ilşikisi varsa
        1-ikisini de yazmak istiyorsak once child exception,sonra parent yazılmalıdır
        aksi takdirde parent ustte olursa ,tum exceptionları yakalayacagından
        child exception'i yazmak anlamsız olur
        2-ikisini yazmak istemezssek ,sadece parent exception yeterli olacaktır
        cunku parent daha kapsayıcıdır ve daha fazla exception u yakalar.
         */


        try {
            FileInputStream fis=new FileInputStream("src/day28_exeptions/metin.txt");
            int k=0;
            while ((k=fis.read())!=(-1)){
                System.out.println((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

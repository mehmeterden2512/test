package day28_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExeptions {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis=new FileInputStream("src/day28_exeptions/metin.txt");
        /*
        bazı codları yazdıgımızda java compile time sırasında o kodlarda exception riskini gorur ve
        bizden bir cozum bekler
        ozellikle dosya okuma ve yazma ile ilgili IO(Input/Output)islerinde JAv ya okuyamazsam ,yaa yazsmassam diyerek
        bizden compile time Da cozum ister
        bu drumda biz exceptıon ile karsılasıldıgında
        kod dursun diyorsak :method satırana Throws keyword kullanılarak beklenilen exception(lar)i deklare edebiliriz
        bu sadece olayın farkında oldugumuzu deklare eder
        exception fırlatmanın ve kodu durdurmanın onune gecmez
        kod calısmaya devam etsin: try-catch-(finayly)blogu kullanabiliriz
         */

    }
}

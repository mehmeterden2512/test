package Day07_ternarySwitchStatements;

public class C11_switchCase {
    public static void main(String[] args) {
        //Kullanicidan ISTQB kisaltmasindan harfin anlamini
        // ogrenmek istedigini alin ve girilen harfin
        //
        // karsiligini yazdirin.
        // I : International S : Software T :
        // Testing Q : Qualifications B: Board

        char harf='s';
        switch (harf){
            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
                case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            default:
                System.out.println("geçersiz harf seçimi");

        }



    }
}

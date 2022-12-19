package Day07_ternarySwitchStatements;

public class C09_switchStatements {
    public static void main(String[] args) {
        //kullanicidan gün numarasini alıp gün ismini yazdırın

        int gunNo=3;
        switch (gunNo){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
                case 7:
                System.out.println("pazar");
                break;

            default:
                System.out.println("gecersiz giriş");

        }





    }
}

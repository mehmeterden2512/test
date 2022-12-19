package Day07_ternarySwitchStatements;

public class C04_ternary {
    public static void main(String[] args) {
        //kullanicidan alinan değer
        //100'den büyükse sayiyi 2 ile çarp
        //100'e eşit veya küçükse sayiya 10 ekle
        int input = 145;
        //ifElse ile
        if (input > 100) {
            input *= 2;
            System.out.println("if else ile:" + input);
        } else {
            input += 10;
            System.out.println("if else ile:" + input);
        }
        input = 145;
        {
            input = input > 100 ? input * 2 : input + 10;
            System.out.println("ternary:" + input);
        }
    }
}

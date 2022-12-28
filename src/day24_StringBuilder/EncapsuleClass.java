package day24_StringBuilder;

public class EncapsuleClass {

    public static int getToplamSatis() {
        return toplamSatis;
    }

    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }

    /*java  class erisimine write and read olarak ayırması ıstendiğinde
                Encapsulation kullanır
                bunun icin oncelikle class uyeleri normal yollarlala erisime kapatılır..

                sonra...

                 */
        public void setSatis(int satis) {//code gENARATE
            this.satis = satis;
            toplamSatis+=this.satis;
            toplamSatis+=this.satis;
        }
        static int toplamSatis=0;
   private  int satis;//deger girilsin ama degeri gormesin
   private  int rapor=100;//gorulsun ama degismesin

   private  int halkaAcikSayi=10;//herkese acık


}

public class BankaHesabi {
    
    private String hesapSahibi;
    private double bakiye;
    
    // Sabit (Final + Static)
    public static final String BANKA_ADI = "BTÜ Bank";
    
    // Static değişken
    private static int toplamHesapSayisi = 0;

    // Parametresiz Constructor
    public BankaHesabi() {
        this.hesapSahibi = "Bilinmiyor";
        this.bakiye = 0.0;
        toplamHesapSayisi++;
    }
    
    // Parametreli Constructor
    public BankaHesabi(String hesapSahibi, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.bakiye = bakiye;
        toplamHesapSayisi++;
    }

    // Getter & Setter
    public String getHesapSahibi() {
        return hesapSahibi;
    }

    public void setHesapSahibi(String hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
    }

    public double getBakiye() {
        return bakiye;
    }

    // İşlem metotları
    public void paraYatir(double para) {
        if (para > 0) {
            this.bakiye += para;
            System.out.println(para + " TL yatırıldı. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Geçersiz tutar! Para yatırılmadı.");
        }
    }
    
    public void paraCek(double para) {
        if (para > 0 && this.bakiye >= para) {
            this.bakiye -= para;
            System.out.println(para + " TL çekildi. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Hata: Yetersiz bakiye veya geçersiz tutar.");
        }
    }

    // Static metot
    public static int getToplamHesapSayisi() {
        return toplamHesapSayisi;
    }

    // toString() - En temiz hali
    @Override
    public String toString() {
        return "Banka: " + BANKA_ADI +
               " | Hesap Sahibi: " + getHesapSahibi() +
               " | Bakiye: " + getBakiye() + " TL";
    }
}
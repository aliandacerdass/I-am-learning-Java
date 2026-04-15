public class BankaHesabi {
    private String hesapSahibi;
    private double bakiye;
    
    // KURAL 1: Sabitler büyük harfle yazılır
    public static final String BANKA_ADI = "BTÜ Bank"; 
    private static int toplamHesapSayisi = 0;

    // Parametresiz Constructor
    public BankaHesabi() {
        this.hesapSahibi = "Bilinmiyor";
        this.bakiye = 0.0;
        toplamHesapSayisi++; // Sayaç arttı
    }
    
    // Parametreli Constructor
    public BankaHesabi(String hesapSahibi, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.bakiye = bakiye;    
        toplamHesapSayisi++; // KURAL 2: Sayaç burada da artmalı!
    }
    
    public String getHesapSahibi() {
        return this.hesapSahibi; 
    }
    public void setHesapSahibi(String hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
    }

    public double getBakiye() {
        return this.bakiye;
    }
    // setBakiye SİLİNDİ! Banka bakiyesi dışarıdan serbestçe değiştirilemez.

    public void paraYatir(double para) {
        // KURAL 3: Sadece pozitif para yatırılabilir
        if (para > 0) {
            this.bakiye += para; 
        } else {
            System.out.println("Geçersiz tutar.");
        }
    }
    
    // Türkçe karakter (Ç) kullanmaktan kaçınmak iyi bir alışkanlıktır
    public void paraCek(double para) {
        // KURAL 3: Çekilecek tutar 0'dan büyük olmalı
        if (para > 0 && this.bakiye - para >= 0) {
            this.bakiye -= para;
        } else {
            System.out.println("Hata: Yetersiz bakiye veya geçersiz tutar.");
        }
    }
    
    public static int getToplamHesapSayisi() {
        return toplamHesapSayisi;
    }
    
    @Override
    public String toString() {
        // Çıktı formatı düzeltildi
        return "Banka Adı: " + BANKA_ADI + " | Hesap Sahibi: " + hesapSahibi + " | Bakiye: " + bakiye;
    }
}
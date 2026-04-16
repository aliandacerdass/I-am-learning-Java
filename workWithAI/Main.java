import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        BankaHesabi hesap1 = new BankaHesabi();
        BankaHesabi hesap2 = new BankaHesabi("Ali Andaç Erdaş", 4560.24);
        BankaHesabi hesap3 = new BankaHesabi("Hüseyin Yılmaz", 10000.55);

        System.out.println("Toplam Hesap Sayısı: " + BankaHesabi.getToplamHesapSayisi());
        System.out.println("-----------------------------------");

        hesap1.setHesapSahibi("Ali Andaç Erdaş");
        hesap1.paraYatir(5000);
        hesap1.paraCek(6000);   // yetersiz bakiye testi
        hesap1.paraCek(2000);

        System.out.println("\n--- Hesap Bilgileri ---");
        System.out.println(hesap1);
        System.out.println(hesap2);
        System.out.println(hesap3);
        System.out.println(hesap1);

        keyboard.close();
    }
}
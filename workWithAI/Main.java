import java.util.Scanner;


public class Main {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        BankaHesabi hesap1 = new BankaHesabi();
        BankaHesabi hesap2 = new BankaHesabi("Ali Andaç Erdaş",4560.24);
        BankaHesabi hesap3 = new BankaHesabi("Hüseyin Yılmaz", 10000.55);

        System.out.println(BankaHesabi.getToplamHesapSayisi());
        hesap1.setHesapSahibi("Ali Andaç Erdaş");
        hesap1.paraYatir(5000);
        hesap1.paraCek(6000);
        hesap1.paraCek(2000);
        System.out.println(hesap1.toString());


    }
}

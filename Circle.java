import java.util.Scanner;
public class Circle{

    public int yarıçap;
    public static final Double PI = 3.14;

    public static double alanHesapla(int yarıçap){
        return yarıçap*PI*yarıçap;

    }
    public double çevreHesapla(int yarıçap){
        return 2*PI*yarıçap;

    }
    public void bilgiVer(int yarıçap){
        System.out.println("yarıçap: "+yarıçap);
        System.out.println("alan: "+alanHesapla(yarıçap));
        System.out.println("çevre: "+çevreHesapla(yarıçap));
    }





}
class BolunmeKurallari {
    public void bolunmeTest(int number) {
        if (number % 3 == 0) System.out.println(number + " 3'e bölünür");
        if (number % 5 == 0) System.out.println(number + " 5'e bölünür");
        if (number % 7 == 0) System.out.println(number + " 7'ye bölünür");
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            System.out.println(number + " hiç birine bölünmüyor.");
        }
    }
}

class FaktoriyelBulma {
    public int faktoriyelHesabi(int number) {
        if (number < 0) {
            System.out.println("Negatif sayının faktöriyeli tanımlı değildir!");
            return -1; // hata işareti
        }
        if (number <= 1) return 1;
        return faktoriyelHesabi(number - 1) * number;
    }
}

class AsalBulma {
    public void ikiSayiArasiAsalBulma(int baslangic, int bitis) {
        if (baslangic > bitis) {
            System.out.println("Başlangıç sayısı bitiş sayısından büyük olamaz!");
            return;
        }
        System.out.println(baslangic + " ile " + bitis + " arasındaki asal sayılar:");
        for (int a = baslangic; a <= bitis; a++) {
            if (a < 2) continue;

            boolean asal = true;
            for (int w = 2; w <= Math.sqrt(a); w++) {
                if (a % w == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(a + " ");
            }
        }
        System.out.println(); // satır atla
    }
}

class Bolunme {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        BolunmeKurallari b = new BolunmeKurallari();
        FaktoriyelBulma f = new FaktoriyelBulma();
        AsalBulma a = new AsalBulma();

        // 1. Bölünme testi - metotlu
        System.out.print("3,5 ve 7'ye bölünme durumunu method ile kontrol etmek için bir sayı giriniz: ");
        int sayi = keyboard.nextInt();
        b.bolunmeTest(sayi);

        // 2. Bölünme testi - methodsuz
        System.out.print("\nAynı testi methodsuz kontrol etmek için bir sayı giriniz: ");
        int sayi1 = keyboard.nextInt();
        if (sayi1 % 3 == 0) System.out.println(sayi1 + " 3'e bölünür");
        if (sayi1 % 5 == 0) System.out.println(sayi1 + " 5'e bölünür");
        if (sayi1 % 7 == 0) System.out.println(sayi1 + " 7'ye bölünür");

        // 3. Faktöriyel - metotlu
        System.out.print("\nFaktöriyelini method ile bulmak için bir sayı giriniz: ");
        int sayi2 = keyboard.nextInt();
        int faktoriyel = f.faktoriyelHesabi(sayi2);
        if (faktoriyel != -1) {
            System.out.println(sayi2 + " sayısının faktöriyeli: " + faktoriyel);
        }

        // 4. Faktöriyel - methodsuz
        System.out.print("\nFaktöriyelini methodsuz bulmak için bir sayı giriniz: ");
        int sayi3 = keyboard.nextInt();
        if (sayi3 < 0) {
            System.out.println("Negatif sayının faktöriyeli tanımlı değildir!");
        } else {
            long total = 1; // büyük sayılar için long kullanmak daha iyi
            for (int y = sayi3; y > 1; y--) {
                total *= y;
            }
            System.out.println(sayi3 + " sayısının faktöriyeli: " + total);
        }

        // 5. Asal bulma - metotlu
        System.out.print("\nAralarındaki asalları method ile bulmak için iki sayı giriniz: ");
        int bas1 = keyboard.nextInt();
        int bit1 = keyboard.nextInt();
        a.ikiSayiArasiAsalBulma(bas1, bit1);

        // 6. Asal bulma - methodsuz
        System.out.print("\nAralarındaki asalları methodsuz bulmak için iki sayı giriniz: ");
        int bas2 = keyboard.nextInt();
        int bit2 = keyboard.nextInt();

        if (bas2 > bit2) {
            System.out.println("Başlangıç sayısı bitiş sayısından büyük olamaz!");
        } else {
            System.out.println(bas2 + " ile " + bit2 + " arasındaki asal sayılar:");
            for (int num = bas2; num <= bit2; num++) {
                if (num < 2) continue;
                boolean asal = true;
                for (int w = 2; w <= Math.sqrt(num); w++) {
                    if (num % w == 0) {
                        asal = false;
                        break;
                    }
                }
                if (asal) System.out.print(num + " ");
            }
            System.out.println();
        }

        keyboard.close(); // iyi alışkanlık
    }
}
import java.util.Locale;
import java.util.Scanner; // Bunu ekledik! Locale, bölge ve dil ayarlarını kontrol eder.

public class SchoolLesson1 {
    public static void main(String[] args){ // Buraya da değineceğim
        System.out.println("Hello world");

        double radius,area;
        double pi = 3.14;
        
        radius = 20 ;
        area = (radius*radius*pi);
        System.out.println("The area of the circle is: "+ area);
    
        Scanner input = new Scanner(System.in);
        
        // Scanner'a Amerikan (US) standartlarını kullanmasını, 
        // yani noktayı ondalık ayracı olarak görmesini söyledik:
        input.useLocale(Locale.US); 
        
        System.out.println("please enter a double");
        double d = input.nextDouble();
        System.out.printf("girilen sayi: %.6f",d);
    }
}
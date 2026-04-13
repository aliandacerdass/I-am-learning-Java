import java.util.Scanner;
public class SchoolLesson2 {
    public static void main(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter a number 1 - 100: ");
        int kosul = keyboard.nextInt();
        System.out.println(kosul>50?"hello":"welcome");
        
        keyboard.close();
    }
}

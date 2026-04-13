class Faktoriyel {
    public void voidFaktoriyel(int number){
        int total =1;
        for(int i=number;i>1;i--){
            total = total *i;

        }
        System.out.println(total);

    }

    public int intFaktoriyel(int number){
        int total =1;
        for(int i=number;i>1;i--){
            total = total *i;

        }
        return total;

    }

    public int recursiveFaktoriyel(int number){
        if (number == 1) return 1;
        else return recursiveFaktoriyel(number - 1) * number;

    }

    public void iterativeFaktoriyel(int number){
        int total =1;
        for(int i=number;i>1;i--){
            total = total *i;

        }
        System.out.println(total);

    }
    public void parametreliFaktoriyel(int number){
        int total =1;
        for(int i=number;i>1;i--){
            total = total *i;

        }
        System.out.println(total);

    }

    public void parametresizFaktoriyel(){
        System.out.println(5*4*3*2*1);

    }

    public void nonstaticFaktoriyel(){
        System.out.println(5*4*3*2*1);

    }

    public static void staticFaktoriyel(){
        System.out.println(5*4*3*2*1);
    }




}




public class Main {
    public static void main(String[] args){

        Faktoriyel f = new Faktoriyel();

        f.voidFaktoriyel(5);

        int faktoriyel2 = f.intFaktoriyel(5);
        System.out.println(faktoriyel2);

        int faktoriyel1 = f.recursiveFaktoriyel(5);
        System.out.println(faktoriyel1);

        f.iterativeFaktoriyel(5);

        f.nonstaticFaktoriyel();

        f.parametreliFaktoriyel(5);

        f.parametresizFaktoriyel();

        Faktoriyel.staticFaktoriyel();


        
    }
}

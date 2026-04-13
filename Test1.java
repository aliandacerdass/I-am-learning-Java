class Bisiklet {

    private String marka;
    private int yas ;
    private int vitesSayisi ; 

    public void setMarka(String girilenMarka ) {
        this.marka = girilenMarka;
    }
    public void setYas(int girilenYas) {
        this.yas = girilenYas;
    }
    public void setVites(int girilenVites ) {
        this.vitesSayisi = girilenVites;
    }

    public String getMarka() {
        return marka;
    }

    public int getYas() {
        return yas;
    }

    public int getVites() {
        return vitesSayisi;
    }

    public void bilgileriGoster() {
        System.out.println("Bisikletin markasi: " + marka);
        System.out.println("Bisikletin yasi: " + yas );
        System.out.println("Bisikletin vitesi: " + vitesSayisi );
    }
}




public class Test1 {
    public static void main(String[] args){

        Bisiklet bisiklet1 = new Bisiklet();

        bisiklet1.setMarka("BMX");
        bisiklet1.setVites(5);
        bisiklet1.setYas(1);

        System.out.println("Bisiklet özellikleri:");
        bisiklet1.bilgileriGoster();


    }
}

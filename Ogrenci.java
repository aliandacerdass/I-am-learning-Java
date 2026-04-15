


public class Ogrenci {
    private String ad ;
    private String soyad ;
    private int vize ; 
    private int finalNot ;

    public Ogrenci(){
        this.ad = "Bilinmiyor";
        this.soyad = "Bilinmiyor";
        this.vize = 0;
        this.finalNot = 0;
    }
    public Ogrenci(String ad,String soyad,int vize,int finalNot){
        this.ad = ad;
        this.soyad= soyad;
        this.vize = vize;
        this.finalNot = finalNot;
    }
    public void setAd(String ad){
        this.ad = ad;
    }
    public String getAd(){
        return ad ;
    }
    public void setSoyad(String soyad){
        this.soyad = soyad;
    }
    public String getSoyad(){
        return soyad;
    }
    public void setVize(int vize){
        this.vize =vize;
    }
    public int getVize(){
        return vize;
    }
    public void setFinalNot(int finalNot){
        this.finalNot =finalNot;
    }
    public int getFinalNot(){
        return finalNot;
    }
    public double ortalamaHesaplama(){
        return (double)(vize * 0.4 + finalNot * 0.6);
    }
    public void bilgiVer(){

        System.out.println("Öğrenci adı: "+getAd());
        System.out.println("Öğrenci soyadı: "+getSoyad());
        System.out.println("Öğrenci vize notu: "+getVize());
        System.out.println("Öğrenci final notu: "+getFinalNot());
        System.out.println("Öğrenci ortalaması: "+ortalamaHesaplama());
    }
    
}

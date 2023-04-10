public class Ogrenci {
    String ad;
    String soyad;
    Okul okul = new Okul();
    public static void main(String[] args){
        Ogrenci ogr = new Ogrenci();
        ogr.ad = "Ayça Ceren";
        ogr.soyad ="Dinçer";
        ogr.okul.okulIsmi="Yeditepe";
        System.out.println(ogr.ad + ogr.soyad + ogr.okul.okulIsmi);
        ogr.ad = "Melih";
        ogr.soyad="Kahraman";
        ogr.okul.okulIsmi="İTÜ";
        System.out.println(ogr.ad + ogr.soyad + ogr.okul.okulIsmi);



    }
}

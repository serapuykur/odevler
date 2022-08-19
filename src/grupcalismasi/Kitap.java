package grupcalismasi;

public class Kitap {

    public String kitapIsmi="Isim belirtilmedi";
    public String yazar="isim belirtilmedi";
    public String turu="Ismi belirtilmedi";
    public  int basimYili;
    public  int sayfaSayisi;
    public int fiyat;

    public Kitap(String kitapIsmi, String yazar, String turu, int basimYili, int sayfaSayisi, int fiyat) {
        this.kitapIsmi = kitapIsmi;
        this.yazar = yazar;
        this.turu = turu;
        this.basimYili = basimYili;
        this.sayfaSayisi = sayfaSayisi;
        this.fiyat = fiyat;


    }


    @Override
    public String toString() {
        return
                "\nkitapIsmi :" + kitapIsmi +
                "\nyazar :" + yazar +
                "\nturu :" + turu +
                "\nbasimYili :" + basimYili +
                "\nsayfaSayisi :" + sayfaSayisi +
                "\nfiyat :" + fiyat ;

    }
}

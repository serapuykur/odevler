package SlaytOdevleri2;

import java.util.Scanner;

public class StringSoru7 {
    public static void main(String[] args) {


    //kullanicidan ismini soyisimini ve kredi karti bilgisini isteyin
    // ve asagidaki gibi yazdirin

    Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi  giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen ssoyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lutfen kredi karti bilgilerinizi giriniz");
        String kartNo=scan.nextLine();

        String isimIlkHarf= isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");

        String kkson4=kartNo.substring(0,4);
        String kkGeriyeKalanlar= " **** **** ****";
        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+ "\n" +
                kkson4+kkGeriyeKalanlar );









}
}

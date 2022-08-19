package SlaytOdevleri2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringSoru4 {
    public static void main(String[] args) {
       // Kullanicidan isim ve soyisim isteyin
        //ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminini\nsoyisminizi giriniz");
        String isim=scan.nextLine();
        String soyIsim=scan.nextLine();



        if(isim.length()>soyIsim.length()){
            System.out.println("isminiz soy isminizden daha uzundur");
        }else{
            System.out.println("soyisminiz isminizden daha uzundur");
        }

    }
}

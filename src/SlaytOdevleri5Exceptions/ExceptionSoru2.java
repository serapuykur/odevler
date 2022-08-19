package SlaytOdevleri5Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSoru2 {
    public static void main(String[] args) {
       /*
       soru=String str [],Urun isimlerini tuttugumuz bir array olsun Kullanicidan istedigi urunun sirasini isteyin
       ve istedigi urunu yazdirin
       Kullanici arrayda  olan bir urun sayisindan buyuk bir sira no girerse
        "Girdiginiz sira urun sayisindan buyuk" yazdirim
        */
        String [] urunler={"elma","armut","kiraz","seftali","kavun","kayisi"};

        Scanner scan=new Scanner(System.in);
        System.out.println("istediginiz urunun sira nosu icin sayi giriniz");
        int istenenSiraNo=0;

        try {
          istenenSiraNo=scan.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Girdiginiz sira urun sayisindan buyuk");
        }
        try{
            System.out.println("Aradiginiz urun :"+urunler[istenenSiraNo-1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girdiginiz sira urun sayisindan buyuk");
        }

    }
}

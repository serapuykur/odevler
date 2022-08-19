package SlaytOdevleri3;

import java.util.Scanner;

public class ForloopSoru9 {
    public static void main(String[] args) {
        //Kullanicidan bir string isteyiniz ve
        // stringi tersine ceviren bir method yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String soz=scan.nextLine();
        sozuTerstenOku(soz);


    }

    public static void sozuTerstenOku(String soz) {
        String terssoz="";
        for (int i =soz.length()-1; i >=0 ; i--) {
            terssoz+=soz.substring(i,i+1);

        }
        System.out.println(terssoz);
    }
}

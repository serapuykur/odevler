package SlaytOdevleri2;

import java.util.Scanner;

public class StringSoru5 {
    public static void main(String[] args) {
        //kullanicidan 4 harfli bir kelime isteyin
        //ve girilen kelimeyi tersten yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String kelime=scan.nextLine();

        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println(tersKelime);
    }
}

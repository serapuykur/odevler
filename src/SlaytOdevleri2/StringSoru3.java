package SlaytOdevleri2;

import java.util.Scanner;

public class StringSoru3 {
    public static void main(String[] args) {
        //kullanicidan bir isim isteyin
        //isim a harfi iceriyorsa girdiginiz isim a harfi iceriyor
        //isim Z harfi iceriyorsa  girdiginiz isim a harfi iceriyor
        //ikisi de yoksa girdiginiz isim a veya z harfi icermiyor yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim=scan.nextLine();

        if(isim.contains("a")){
            System.out.println("girdiginiz isim a harfi iceriyor");
        }else if(isim.contains("Z")){
            System.out.println("girdiginiz isim Z harfi iceriyor");
        }else{
            System.out.println("girdiginiz isim a veya z harfi icermiyor ");
        }
    }
}

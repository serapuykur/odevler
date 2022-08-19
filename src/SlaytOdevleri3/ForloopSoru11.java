package SlaytOdevleri3;

import java.util.Scanner;

public class ForloopSoru11 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin.
        // girilen sayilar ve aralarindaki tum sayilari toplayip sonucu yazdiran bir program yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  aralarina enter koyarak iki ayri  sayi giriniz ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        butunsayilariTopla(sayi1,sayi2);
    }

   public static void butunsayilariTopla(int sayi1, int sayi2) {

       for (int i =sayi1; i <=sayi2 ; i++) {
           System.out.println(i);


       }

    }
}

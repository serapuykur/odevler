package SlaytOdevleri3;

import java.util.Scanner;

public class ForloopSoru4 {
    public static void main(String[] args) {
        //kullanicidan 100 den kucuk bir tamsayi isteyin 1` den baslayarak girilen sayiya kadar 3 un kati olan sayilari
        //yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Yuzden kucuk bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 3 == 0) {
                System.out.print(i+" ");
            } else {

            }
        }
    }}

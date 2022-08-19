package SlaytOdevleri3;

import java.util.Scanner;

public class ForloopSoru6 {
    public static void main(String[] args) {
        /*Kullanicidan 100 den kucuk bir tamsayi isteyin.1 `den baslayarak girilen tamsayiya kadar
        tum sayilari yazdirin.Ancak;
        -sayi 3 un kati ise sayi yerine "Java "yazdirin
        -Sayi 5 in kati ise yerine "Guzeldir "yazdirin
        =sayi hem3 hem de 5 in kati ise sayi yerine "Java Guzeldir "yazin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("LUtfen 100 den kucuk bir tamsayi yaziniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("Java Guzeldir"+" ");
            } else if (i %5 == 0) {
                System.out.print("Guzeldir"+" ");
            } else if (i %3 == 0) {
                System.out.print("Java"+" ");
            } else {
                System.out.print(i+" ");

            }
        }
    }
}
package ReplitSorulari2;

import java.util.Scanner;

public class ConditionalStatementsSoru1 {
    public static void main(String[] args) {
        //Soru;giirlen sayinin pozitif negatif veya 0 olup olmadigini yazdiran java kodu yaziniz

        Scanner in=new Scanner(System.in);
        int input=in.nextInt();

        if(input>0){
            System.out.println("Sayi pozitif");
        }else if(input<0){
            System.out.println("sayi negatif");
        }else{
            System.out.println("sayi 0");
        }
    }
}

package SlaytOdevleri3;

import java.util.Scanner;

public class ForloopSoru10 {
    public static void main(String[] args) {
        //kullanicidan bir string isteyin .Kullanicinin girdigi stringin
        //palindrome olup olmadigini kontrol eden bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir strin giriniz");
        String str = scan.nextLine();

        String palindrome = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            palindrome += str.substring(i, i + 1);
        }
            if (str.equals(palindrome)) {
                System.out.println("bu str palindrome`dur");

            } else {
                System.out.println("str palindrom degildir");
            }



    }
}
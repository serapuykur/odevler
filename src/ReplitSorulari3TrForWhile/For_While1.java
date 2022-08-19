package ReplitSorulari3TrForWhile;

import java.util.Scanner;

public class For_While1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak
        karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen  bir karakter giriniz");
        char karakter=scan.next().charAt(0);
    int tane=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (karakter==cumle.charAt(i)){

                ++tane;

        }

        }
        System.out.println(karakter+ " yazi icinde "+tane+" tanedir");
    }
}

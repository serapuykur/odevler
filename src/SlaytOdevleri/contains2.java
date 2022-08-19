package SlaytOdevleri;

import java.util.Scanner;

public class contains2 {
    public static void main(String[] args) {
        /*kullanicidan bir cumle isteyin
       - cumle buyuk kelimesi iceriyorsa tum cumleyi buyuk harf olarak
       -kucuk harf iceriyorsa tum cumleyi kucuk harf olarak yazdirin
       -iki kelimeyi de icermiyorsa cumle buyuk yada kucuk kelimesi icermiyor yazdirin

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

        if(cumle.contains("buyuk") &&  cumle.contains("kucuk")){
            System.out.println("kara ver buyuk mu kucuk mu yazdirayim");
        }else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("cumle buyuk yada kucuk kelimesi icermiyor");

        }

    }
}

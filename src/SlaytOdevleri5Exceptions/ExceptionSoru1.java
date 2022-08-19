package SlaytOdevleri5Exceptions;

import java.util.Scanner;

public class ExceptionSoru1 {
    public static void main(String[] args) {
       /* Kullanicidan carpma yapmak icin bir String isteyin.Kullanicinin girdigi String sadece sayilardan
       olusuyorsa sayiyi 2 ile carpip sonucu yazdirin
       Kullanici sayilardan olusmayan bir string girerse "girdiginiz sayi Stringe cevrilemez " yazdirin

    */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen carpma yapmak icin bir String giriniz");
        String str=scan.nextLine();

        int sayi=0;


        try{
           sayi=Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("girdiginiz sayi Stringe cevrilemez");
        }
        catch(Exception e){
            System.out.println("ongorulemeyen bir hata olustu");
        }
        System.out.println("sayinin 2 ile carpimi : "+(sayi*2));
    }
}

package ReplitSorulari3TrForWhile;

import java.util.Scanner;

public class For_While2 {
    /* Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

     Input :
             30
             40
              Beklenen Cikti:
             30 ve 40 icin GCD = 10
             30 ve 40 icin LCM = 120
             */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki tam sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
       int enBuyuk,enKucuk,r;
       int max=sayi1*sayi2;
       int LCM=0;
       if(sayi1>sayi2){
           enBuyuk=sayi1;
           enKucuk=sayi2;
      }else{
           enBuyuk=sayi2;
           enKucuk=sayi1;
       }
       while(enKucuk !=0){
           r=enBuyuk%enKucuk;
           enBuyuk=enKucuk;
           enKucuk=r;
       }
        System.out.println(sayi1+ "ve "+sayi2+" icin GDV = "+enBuyuk);//ebob bulundu

        for (int i = max; i >0 ; i--) {
            if(i%sayi1==0 && i % sayi2 ==0){
                LCM=i;
            }

        }
        System.out.println(sayi1+ "ve "+sayi2+" icin LCM = "+LCM);

    }
}
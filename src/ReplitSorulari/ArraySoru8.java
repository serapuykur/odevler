package ReplitSorulari;

import java.util.Arrays;

public class ArraySoru8 {
    public static void main(String[] args) {
        //Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

               // Array: [1232,2345,5467,678,3454,2312,3451]

        int[] sayilar={1232,2345,5467,678,3454,2312,3451};
        int minSayi=sayilar[0];
        for (int i =1; i < sayilar.length; i++) {
            if(sayilar[i]<minSayi){
                minSayi=sayilar[i];
            }

        }


        System.out.println("Arraydaki en kucuk sayi : "+ minSayi);
    }
    }


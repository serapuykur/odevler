package SlaytOdevleri4ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiziOdev {
    public static void main(String[] args) {
        /*   "Integer sayılardan oluşan bir diziyi parametre olarak alan
          ve dizide 7 rakamı  var ise  "Boom!" ifadesini;
      aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".

         Örnek çıktı:
                [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"

      */
         int[] dizi= {1, 2, 3, 4, 5, 6,7 };
        String yeni="";
        String sonuc=yediVarmi(dizi,yeni);
    }

 public static String yediVarmi(int[] dizi, String yeni) {
     for (int i = 0; i < dizi.length; i++) {
         yeni+=dizi[i];

     }
     if(yeni.contains("7")){
         System.out.println("Boom!");
     }else{
         System.out.println("dizide 7 rakami yok");
     }
     return yeni;
    }
}

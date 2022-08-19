package ReplitSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array5 {
    public static void main(String[] args) {
        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]

        Aranan Değer:2020
        Beklenen Çıktı:**True**
        Aranan Değer:2010
        Beklenen Çıktı :**False**


         */
        int [] arr={1551,1223,1443,1267,1789,1023,2020};
        List<Integer> arr2=new ArrayList<>();
        for (int each:arr
             ) {
            arr2.add(each);
        }
        System.out.println(arr2);
        System.out.println(arr2.contains(2020));//true
        System.out.println(arr2.contains(2010));//false
    }
}

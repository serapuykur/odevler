package SlaytOdevleri4ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop2 {
    public static void main(String[] args) {
        //soru:bir integer liste olustutununz.Bu listteki tum sayilarin karelerinin toplamini  For each loop
       // kullanarak bulunuz .sonucu ekrna yazdiriniz

        int[]sayilar={1,2,3,4};
         int toplam=0;

        for (int each:sayilar
             ) {
            toplam+=each*each;


        }
        System.out.println("kareler toplami"+ toplam);
    }
}

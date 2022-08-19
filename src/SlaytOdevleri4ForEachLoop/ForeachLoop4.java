package SlaytOdevleri4ForEachLoop;

import java.util.Arrays;

public class ForeachLoop4 {
    public static void main(String[] args) {
        //bir string olusturunuz,bu stringdeki karakterlri for each loop kullnarak yazdiriniz

        String cumle="Javayi ogrensem keske";
        String karakterler[]=cumle.split("");

        for (String each:karakterler
             ) {


        }
        System.out.println(Arrays.toString(karakterler));//[J, a, v, a, y, i,  , o, g, r, e, n, s, e, m,  , k, e, s, k, e]

    }
}

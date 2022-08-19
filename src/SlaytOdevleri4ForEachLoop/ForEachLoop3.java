package SlaytOdevleri4ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop3 {
    public static void main(String[] args) {
       /*
        iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
       kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        */

        String[]arr1={"1","2","3"};
        String[]arr2={"4","2","5"};

        List<String> ortakEleman=new ArrayList<>();
        for (String each1:arr1
             ) {
            for (String each2:arr2
                 ) {
                if(each1.equalsIgnoreCase(each2)){
                    ortakEleman.add(each1);
                }

            }
        }
      if(ortakEleman.isEmpty()){
          System.out.println("Hic ortak eleman yok");
      }else{
          System.out.println("Her iki arrayda da ortak elemanlar :"+ortakEleman);
      }


    }
}

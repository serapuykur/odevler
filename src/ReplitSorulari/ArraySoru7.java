package ReplitSorulari;

import java.util.ArrayList;
import java.util.List;

public class ArraySoru7 {

    public static void main(String[] args) {
        /*
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.

        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

        Beklenen Çıktı:
[Python, JAVA, PHP, Perl, C#, C++]

         */
      String [] arr = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
      List<String> arr2=new ArrayList<>();

        for (String each:arr
             ) {
            arr2.add(each);

        }
        System.out.println(arr2);
    }
}

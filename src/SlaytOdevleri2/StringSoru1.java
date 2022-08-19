package SlaytOdevleri2;

public class StringSoru1 {
    public static void main(String[] args) {
        //soru string methodlarini kullanarak "Java ogrenmek123 Cok guzel@" stringini java ogrenmek cok guzel
       // sekline getiriniz

        String cumle="Java ogrenmek123 Cok guzel@";

        System.out.println(cumle.replace("123","").replace("@","")
                .replace("C","c"));


    }
}

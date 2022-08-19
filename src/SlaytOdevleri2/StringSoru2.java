package SlaytOdevleri2;

public class StringSoru2 {
    public static void main(String[] args) {
        //String sekilde verilen asagidaki fiyatlarin toplamini bulunuz
        String str1 = "$13.99";
        String str2 = "$10.55";

        String sadeStr1= str1.replace("$","");
        String sadeStr2=str2.replace("$","");

        double first=Double.valueOf(sadeStr1);
        double second=Double.valueOf(sadeStr2);


        System.out.println(first+second);


    }
}
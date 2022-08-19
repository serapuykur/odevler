package SlaytOdevleri3;

public class ForloopTerstenYazKendiYontemim {
    public static void main(String[] args) {

        String kelime="ey edip adanada pide ye";
        String tersKelime=" ";
        for (int i =kelime.length()-1; i>=0 ; i--) {
            tersKelime+=kelime.substring(i,i+1);

        }
        System.out.println(tersKelime);
    }
}

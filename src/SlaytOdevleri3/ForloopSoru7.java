package SlaytOdevleri3;

public class ForloopSoru7 {
    public static void main(String[] args) {
        String input="Java gun gectikce guzellesiyor";
        terstenYazdirmak(input);

    }

   public static void terstenYazdirmak(String input) {
        String tersinput=input.substring(input.length()-1);
       for (int i =input.length()-2 ; i >=0 ; i--) {
           tersinput+=input.substring(i,i+1);

       }
       System.out.println(tersinput);
    }
}

import java.util.Scanner;

public class Morse{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Converter converter = new Converter();

        String resultat;

        while(true){
            String text = scan.nextLine();
            if (text.contains("*") || text.contains("-")){
                resultat = converter.getMorse(text);
                System.out.println("Den Konverterade morse är " + resultat);
            }else{
                resultat = converter.getText(text);
                System.out.println("Den Konverterade texten är " + resultat);

            }
        }

    }

}

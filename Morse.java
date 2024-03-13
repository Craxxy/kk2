import java.util.Scanner;

public class Morse{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Converter converter = new Converter();

        String resultat;

        while(true){
            try{
                System.out.println("Choose\n1: Text to Morse\n2: Morse to Text");

                int inputMenu = Integer.parseInt(scan.nextLine());
                String input;

                if (inputMenu==1){
                    input = scan.nextLine();
                    resultat = converter.getMorse(input);
                    System.out.println("Den Konverterade morse är " + resultat);
                }else if (inputMenu==2){
                    input = scan.nextLine();
                    resultat = converter.getText(input);
                    System.out.println("Den Konverterade texten är " + resultat);

                }else{
                    throw new Exception();
                }
            }
            catch(NumberFormatException e){
                System.out.println("Please only enter number");
            }
            catch(Exception e){
                System.out.println("Please choose a number between 1 and 2");
            }
        }

    }

}

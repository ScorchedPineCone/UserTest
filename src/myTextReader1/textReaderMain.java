package myTextReader1;

import java.util.Scanner;

public class textReaderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Tillåter användaren att ge input.
        textReader myTextReader = new textReader();
        System.out.println("Hello! What would you like me to read? To quit, simply type 'stop'. ヽ(•‿•)ノ");
        while (true) {
            String input = scanner.nextLine(); //Anropas av readInput-metoden i textReader-konstruktorn.
            if (input.equalsIgnoreCase("stop")) {
                //fram tills det att användaren skriver "stop" så kommer programmet att köras
                break; //Här avslutas programmet och resultat presenteras.
            }
            myTextReader.readInput(input); //Kallar på readInput-metoden ifrån textReader-konstruktorn.
            System.out.println("You wrote: "+" '"+input+"' "+"＼(-_- )"); //Hämtar och skriver ut vad användaren skrivit in utan att printa något resultat.
        }
        String result = myTextReader.readResults(); //Kallar på readResults-metoden ifrån textReader-konstruktorn
        System.out.println(result);
    }
}

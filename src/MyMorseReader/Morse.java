package MyMorseReader;

import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();


        System.out.println("Choose the following options:");
        System.out.println("1. English to morse");
        System.out.println("2. Morse to English");
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            //int choice = scanner.nextInt();
            //scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Write a English letter to translate: ");
                    String englishInput = scanner.nextLine();
                    if (isValidEnglishInput(englishInput)) {
                        System.out.println("Unknown format, please use only the letters and codes found in the international morse chart!");
                        return;
                        //!isValidEnglishInput är inverterad för att spara tid från att lägga in bokstäver och teckan som inte finns med på listan.
                    }
                    String morse = converter.toMorse(englishInput);
                    System.out.println("Morse: " + morse);
                    break;
                case 2:
                    System.out.println("Write Morse to translate into English: ");
                    String morseInput = scanner.nextLine();
                    if (isValidMorseInput(morseInput)) {
                        String english = converter.toEnglish(morseInput);
                        System.out.println("English: " + english);
                        break;
                        //Här låter "isValid" vara som den ska då den enbart behöver hålla på två olika tecken "*" och "-", allt annat rökas som ogiltig input och leder till felmeddelandet nedan.
                    } else {
                        System.out.println("Unknown format, please use only the letters and codes found in the international morse chart!");
                        return;
                    }
                default:
                    System.out.println("Faulty input, choose option 1. or 2.");
                    break;
            }
        } catch (NumberFormatException e) {
            //Om användaren ger input som är utanför val 1 och 2 så printas följande felmeddelande ut och programmet stängs av.
            System.out.println("Unknown format, please use only the letters and codes found in the international morse chart!");
        }

        /* String input = scanner.nextLine();



        String morse = converter.toMorse(input);
        System.out.println("Morse: " + morse); */
    }


    private static boolean isValidEnglishInput(String input) {
        return input.matches("[a-zA-Z0-9.,-?]+");
    } //Anropas ifrån If-satsen i case 1:,
    // här kollar den igenom "godkända" täcken som skrivits in i regex, allt utanför ger ett felmeddelandet "Unknown format..."

    private static boolean isValidMorseInput(String input) {
        return input.matches("[*-]+");
    } //Finns i IF-satsen case 2:, fungerar som ovanstående metod och tillåter användaren att översätta morsekod till siffror och tillåtna tecken i Hashmappen.
}

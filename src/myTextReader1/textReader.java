package myTextReader1;

public class textReader {
    //int rows och int letters används för att räkna bokstäver och antal rader som användaren
    //skriver i textReaderMain.
    private int rows = 0;
    private int letters = 0;

    public void readInput(String input) {
    //Metoden "readInput" läser av vad användaren har skrivit ifrån main textReaderMain-metoden, varje gång användaren-
    //ger input och trycker på 'enter' så sparas först "rows" och sedan "letters", rows är +1 för varje gång användaren trycker-
    //på enter, letters är varje "bokstav" som användaren skriven in.
        if(!input.isEmpty()) {
            rows++;
            letters += input.length();

        }
    }
    public void readResults(){
        //Metoden anropas när användaren skriver "stop", programmet skriver ut antal rader och tecken som användaren har skrivit in.
        System.out.println("I've read: "+rows+" row(s) and it had "+letters+" letter(s), you can start running now...(｢• ω •)｢");
    }
}


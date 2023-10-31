package UserTDD;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTestT {
    //1. Skapa en Testklass och utveckla efter TDD
    //2. Skapa ett test för en tänkt klass User autogenerar klassen ifrån testklassen
    //3. Uppdatera testet så att konstruktorn i User får två parametrar av typen String
    //4 Skriv koden som gör att testet i uppgiften 3 blir godkänt och sparar parametrar i två attribut:
    //userName, password. för alla kommande uppgifter gör likadant Red-Green-Refactor.
    //5. Skriv test som hämtar attributet userName
    //6 Skriv test som hämtar attributet passWord

    @Test
    public void testGetUserName(){
        User user = new User("Johan","admin");
                String expected = "Johan";
                String actual = user.getUserName();
                assertEquals(expected,actual);
    }
    @Test
    public void testGetPassWord(){
        User user = new User("Johan","admin");
        String expected = "admin";
        String actual = user.getUserPassword();
        assertEquals(expected,actual);
    }
    @Test
    public void testChangeUserName(){
        User user = new User("Bob","admin");
        String expected = "Rickard";

        user.ChangeUserName("Rickard");
        String actual =user.getUserName();
        assertEquals(expected,actual);
    }
    @Test
    public void testSetFourCharacterUserName(){
        User user = new User ("Erik","password");
        String expected = "Mats";

        user.ChangeUserName("Mats");
        String actual = user.getUserName();

        assertEquals(expected,actual);

    }
    @Test
    public void testEmptyStringUserName(){
        User user = new User("Erik","password");
        String expected = "Erik";

        user.ChangeUserName("");
        String actual = user.getUserName();

        assertEquals(expected,actual);


    }
    //Skriv test som gör det möjligt att uppdatera lösenordet.
    //Ett lösenord måste ha minst 7 tecken och får vara högst 20 tecken långt
    @Test
    public void testChangePasswordMinimum(){
        User user = new User("Erik","CHEMICOPHYSIOLOGICAL");
        boolean expected = true;
        boolean actual = user.changePassword();


        assertEquals(expected,actual);
    }
}

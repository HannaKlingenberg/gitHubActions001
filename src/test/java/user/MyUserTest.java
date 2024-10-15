package user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyUserTest {

    @Test
    public void TestUser(){

        MyUser myUser = new MyUser("Hanna", "lösenord");

        String myUserName = myUser.getUserName();
        String myPassword = myUser.getPassword();

        // assertEquals("Hanna", myUserName);
       // assertEquals("lösenord", myPassword);

        assertAll("Test multiple assertions",
                () -> assertEquals("Hanna", myUserName),
                () -> assertEquals("lösenord", myPassword)
        );



    }
}

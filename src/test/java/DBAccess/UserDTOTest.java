package DBAccess;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

import static org.junit.Assert.*;

public class UserDTOTest {

    private UserDTO user;

    @Before
    public void setUp() throws Exception {
        user = new UserDTO(1, "AAA", "BBB");
    }

    @After
    public void tearDown() throws Exception {
        user = null;
    }

    @Test
    public void testToString() {
        String userExpected = "Userid : 1, name : AAA, sureName : BBB";
        assertEquals(userExpected, user.toString());
    }
}
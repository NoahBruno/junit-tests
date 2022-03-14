import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {
    

    @Test
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeUpCrypt.version, 0);
        CodeUpCrypt.version = 1.2;
        assertEquals(1.2, CodeUpCrypt.version, 0);
    }

    @Test
    public void testHashPassword(){
        assertEquals("C0d39p", CodeUpCrypt.hashPassword("Codeup"));
        assertEquals("F3r", CodeUpCrypt.hashPassword("Fer"));
        assertEquals("123", CodeUpCrypt.hashPassword("123"));
        assertEquals("124", CodeUpCrypt.hashPassword("12a"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue("check password", CodeUpCrypt.checkPassword("fer", "f3r"));
        assertFalse("check password", CodeUpCrypt.checkPassword("fer", "fer"));
    }

}

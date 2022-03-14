import org.junit.Test;
import static org.junit.Assert.*;

public class jUnitTests {


        @Test
        public void testIfNameIsKenneth(){
            String expected = "kenneth";
            String actual = "kenneth";
            assertEquals(expected, actual);
        }

        @Test
    public void textIfChangeIsCorrect(){
            Double price = 10.0;
            Double discount = 4.5;

            assertEquals(5.5,price - discount, 0);
//            assertEquals(5.1, price - discount, );
        }
}

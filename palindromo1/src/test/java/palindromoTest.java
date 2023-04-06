import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class palindromoTest {

    @Test
    public void testEsPalindromo() {
        assertTrue(Main.esPalindormo("reconocer", Main.palindromo("reconocer")));
        assertFalse(Main.esPalindormo("reconcer", Main.palindromo("reconocer")));
    }
}
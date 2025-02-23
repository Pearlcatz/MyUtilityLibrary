import com.example.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        Assertions.assertEquals("olleH", StringUtils.reverse("Hello"));
    }

    @Test
    public void testIsPalindrome() {
        Assertions.assertTrue(StringUtils.isPalindrome("madam"));
        Assertions.assertFalse(StringUtils.isPalindrome("hello"));
    }
}

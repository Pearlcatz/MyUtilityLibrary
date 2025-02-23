import com.example.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        Assertions.assertEquals(10, MathUtils.add(5, 5));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(25, MathUtils.multiply(5, 5));
    }

    @Test
    public void testMax() {
        MathUtils MathUtils = null;
        Assertions.assertEquals(7, com.example.MathUtils.max(3, 7));
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testArrayJunit {
    testArray compare = new testArray();

    @Test
    public void testFound() {
        int[] numbers1 = {1, 2, 3, 4, 5, 6};
        int[] numbers2 = {3, 4};
        int result = 0;

        result = compare.arrayMatch(numbers1, numbers2);

        assertEquals(2, result);
    }

    @Test
    public void testNotFound() {
        int[] numbers1 = {1, 2, 3, 4, 5, 6};
        int[] numbers2 = {3, 6};
        int result = 0;

        result = compare.arrayMatch(numbers1, numbers2);

        assertEquals(0, result);
    }

}

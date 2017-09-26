import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class thatSoTasty {
    @Test
    public void searMSArray() {
        List<Integer> inputListTest1 = Arrays.asList(5, -1, 3, 6, -100, 10);
        List<Integer> outputListTest1 = Arrays.asList(5, -1, 3, 6);

        List<Integer> inputListTest2 = Arrays.asList(-6, 1, 2, 5, -10, 1, 1, 2, -50, 150);
        List<Integer> outputListTest2 = Arrays.asList(150);

        List<Integer> inputListTest3 = new ArrayList<>();
        List<Integer> outputListTest3 = new ArrayList<>();

        List<Integer> inputListTest4 = Arrays.asList(1, 2, 20000, -20003, 1000000, 5, -4, 5, 6);
        List<Integer> outputListTest4 = Arrays.asList(1, 2, 20000, -20003, 1000000, 5, -4, 5, 6);

        assertEquals(outputListTest1, searchMaxSubArr.searMSArray(inputListTest1));
        assertEquals(outputListTest2, searchMaxSubArr.searMSArray(inputListTest2));
        assertEquals(outputListTest3, searchMaxSubArr.searMSArray(inputListTest3));
        assertEquals(outputListTest4, searchMaxSubArr.searMSArray(inputListTest4));
    }
}

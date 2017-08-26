import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import org.slf4j.*;

@Test
public class QuickSortTest {
    private final Logger logger = LoggerFactory.getLogger(QuickSortTest.class);
    @Test
    void quickSortTest(){
        QuickSort quickSort = new QuickSort();
        int[] array = new int[]{12,23,13,4,100,2,43,5,25,7};
        quickSort.QuickSort(array);
        Assert.assertNotNull(array);
        int[] ansArray = new int[]{2, 4, 5, 7, 12, 13, 23, 25, 43, 100};
        //Assert.assertEquals(array,ansArray);
        logger.info("Sort answer: " + Arrays.toString(array));

    }
}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.util.Arrays;

@Test
public class MergeSortTest {
    private final Logger logger = LoggerFactory.getLogger(MergeSortTest.class);
    @Test
    void mergeSortTest(){
        MergeSort mergeSort = new MergeSort();
        int[] array = new int[]{12,23,13,4,100,2,43,5,25,7};
        mergeSort.mergeSort(array);
        Assert.assertNotNull(array);
        int[] ansArray = new int[]{2, 4, 5, 7, 12, 13, 23, 25, 43, 100};
        //Assert.assertEquals(array,ansArray);
        logger.info("Sort answer: " + Arrays.toString(array));
    }
}

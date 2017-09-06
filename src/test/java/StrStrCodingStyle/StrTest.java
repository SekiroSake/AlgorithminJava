package StrStrCodingStyle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class StrTest {
    private final Logger logger = LoggerFactory.getLogger(StrTest.class);

    @Test
    private void testStr(){
        Solution solution = new Solution();
        String source = "sourcetarget";
        String target = "target";

        int retVal = solution.strStr(source,target);
        logger.info("Target pos at: " + retVal);
    }
}

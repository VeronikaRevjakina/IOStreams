package test.java;
import org.junit.Test;
import main.java.KeywordsFindHelper;

import static org.junit.Assert.assertTrue;

public class KeywordsFindHelperTest {
    @Test
    public void isJavaKeywordShouldReturnTrue(){
        String word="volatile";
        assertTrue(KeywordsFindHelper.isJavaKeyword(word));
    }

    @Test
    public void isJavaKeywordShouldReturnFalse(){
        String word="umbrella";
        assertTrue(!KeywordsFindHelper.isJavaKeyword(word));
    }
}

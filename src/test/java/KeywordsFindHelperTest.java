package test.java;
import org.junit.Test;
import main.java.KeywordsFindHelper;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class KeywordsFindHelperTest {
    @Test
    public void isJavaKeywordShouldReturnTrue(){
        String word="volatile";
        assertTrue(KeywordsFindHelper.isJavaKeyword(word));
    }

    @Test
    public void isJavaKeywordShouldReturnFalse(){
        String word="umbrella";
        assertFalse(KeywordsFindHelper.isJavaKeyword(word));
    }

    @Test
    public void isJavaKeywordShouldReturnFalseForEmptyString(){
        String word="";
        assertFalse(KeywordsFindHelper.isJavaKeyword(word));
    }
}

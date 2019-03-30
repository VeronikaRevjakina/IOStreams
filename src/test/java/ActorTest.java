package test.java;

import main.java.Actor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest {
    @Test
    public void toStringShouldReturnNameAndSurname(){
        Actor actress=new Actor("Mila","Kunis");
        assertEquals("Mila Kunis",actress.toString());
    }
}

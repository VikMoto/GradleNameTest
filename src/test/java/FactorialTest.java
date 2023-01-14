import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FactorialTest {
     @Test
     public void testThat0InputHandledCorrectly(){
        final long actual = new Factorial().calcFact(0);
        Assertions.assertEquals(1,actual);
    }
    @Test
    public void testThat1InputHandledCorrectly(){
        final long actual = new Factorial().calcFact(1);
        Assertions.assertEquals(1,actual);
    }
    @Test
    public void testThat3InputHandledCorrectly(){
        final long actual = new Factorial().calcFact(3);
        Assertions.assertEquals(6,actual);
    }
    @Test
    public void testThat12InputHandledCorrectly(){
        final long actual = new Factorial().calcFact(12);
        Assertions.assertEquals(479001600,actual);
    }
    @Test
    public void testThat18InputHandledCorrectly(){
        final long actual = new Factorial().calcFact(18);
        Assertions.assertEquals(6402373705728000L,actual);
    }
    @Test
    public void testThatNegativeInputHandledCorrectly(){
         Assertions.assertThrows(
                 IllegalArgumentException.class,
                 () -> new Factorial().calcFact(-1));
    }
    @Test
    public void testThatMaxInputHandledCorrectly(){
         int maxN = 20;
         Assertions.assertThrows(
                 IllegalArgumentException.class,
                 () -> new Factorial().calcFact(maxN +1));
    }
}


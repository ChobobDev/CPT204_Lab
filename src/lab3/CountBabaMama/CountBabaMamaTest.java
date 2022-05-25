package lab3.CountBabaMama;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountBabaMamaTest {

    @Test
    public void test1(){
        String a = "aba babaa amama ma";
        int expected = 2;
        assertEquals(expected, CountBabaMama.countBabaMama(a));
    }

    @Test
    public void test2(){
        String a = "bababamamama";
        int expected = 4;
        assertEquals(expected, CountBabaMama.countBabaMama(a));
    }
}
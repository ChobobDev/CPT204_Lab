package lab3.DelDuplicate;
import org.junit.Test;
import static org.junit.Assert.*;

public class DelDuplicateTest {

    @Test
    public void test1(){
        assertEquals("abc", DelDuplicate.delDuplicate("aaabbc"));
    }

    @Test
    public void test2(){
        assertEquals("a", DelDuplicate.delDuplicate("aaaaa"));
    }
}
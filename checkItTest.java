import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class checkItTest {

    @Test
    public void predicateCoverageTest1() {
       boolean a = true;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void predicateCoverageTest2() {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        assertEquals("P isn't true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void clauseCoverageTest1() {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void clauseCoverageTest2() {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void clauseCoverageTest3() {

        boolean a = false;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void clauseCoverageTest4() {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        assertEquals("P isn't true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void caccCoverageTest1() {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void caccCoverageTest2() {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        assertEquals("P isn't true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void raccCoverageTest1() {

        boolean a = true;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void raccCoverageTest2() {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void mccCoverageTest1() {
        boolean a = false;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

}

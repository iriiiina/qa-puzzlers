package ee.puzzlers.junit.assertEquals

import org.junit.Test

import static org.hamcrest.Matchers.nullValue
import static org.junit.Assert.assertEquals

class Puzzle4 {

    @Test
    void puzzle() {
        String string = null

        assertEquals(nullValue(), string)
    }

    // What is the result?
    //   a) true
    //   b) false
    //   c) something else

}

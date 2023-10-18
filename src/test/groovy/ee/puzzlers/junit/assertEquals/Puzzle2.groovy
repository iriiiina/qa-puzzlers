package ee.puzzlers.junit.assertEquals

import org.junit.Test

import static org.hamcrest.Matchers.equalTo
import static org.hamcrest.Matchers.nullValue
import static org.junit.Assert.assertEquals

class Puzzle2 {

    @Test
    void puzzle() {
        String string = ""

        assertEquals(nullValue(), string)
    }

    // What is the result?
    //   a) true
    //   b) false
    //   c) something else

}

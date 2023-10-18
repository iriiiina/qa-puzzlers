package ee.puzzlers.junit.assertEquals

import org.junit.Test

import static org.hamcrest.Matchers.blankString
import static org.junit.Assert.assertEquals

class Puzzle5 {

    @Test
    void puzzle() {
        String string = ""

        assertEquals(blankString(), string)
    }

    // What is the result?
    //   a) true
    //   b) false
    //   c) something else

}

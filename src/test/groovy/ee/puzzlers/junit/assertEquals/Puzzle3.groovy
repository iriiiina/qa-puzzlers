package ee.puzzlers.junit.assertEquals

import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.containsInAnyOrder
import static org.hamcrest.Matchers.nullValue
import static org.junit.Assert.assertEquals

class Puzzle3 {

    @Test
    void puzzle() {
        String string

        assertEquals(nullValue(), string)
    }

    // What is the result?
    //   a) true
    //   b) false
    //   c) something else

}

package ee.puzzlers.hamcrest.emptyOrNullString

import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.nullValue

class Puzzle5 {

    @Test
    void puzzle() {
        String string = ""

        assertThat(string, nullValue())
    }

    // What is the result?
    //   a) true
    //   b) false
    //   c) something else

}

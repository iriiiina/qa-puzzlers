package ee.puzzlers.hamcrest.emptyOrNullString

import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.blankOrNullString

class Puzzle11 {

    @Test
    void puzzle() {
        String string

        assertThat(string, blankOrNullString())
    }

    // What is the result?
    //   a) true
    //   b) false
    //   c) something else

}

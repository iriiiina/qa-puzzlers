package ee.puzzlers.hamcrest.emptyOrNullString

import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.equalTo
import static org.hamcrest.Matchers.nullValue

class Puzzle1 {

    @Test
    void puzzle() {
        String string = ""

        assertThat(string, equalTo(nullValue()))
    }

    // What is the result?
    //   a) true
    //   b) false
    //   c) something else

}

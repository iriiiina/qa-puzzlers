package ee.puzzlers.hamcrest.emptyOrNullString

import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.blankString
import static org.hamcrest.Matchers.equalTo

class Puzzle7 {

    @Test
    void puzzle() {
        String string = ""

        assertThat(string, equalTo(blankString()))
    }

    // What is the result?
    //   a) true
    //   b) false
    //   c) something else

}

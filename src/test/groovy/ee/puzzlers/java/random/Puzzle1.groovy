package ee.puzzlers.java.random

import org.junit.Test

import java.text.DecimalFormat

class Puzzle1 {

    @Test
    void puzzle() {
        String random = new DecimalFormat("0000000000").format( (int) (Math.random() * 9999999999))

        println random
        println random
        println random
    }

    // What will it print?
    //   a) <random number>
    //      <random number>
    //      <random number>
    //   b) 2147483647
    //      2147483647
    //      2147483647
    //   c) something else
}

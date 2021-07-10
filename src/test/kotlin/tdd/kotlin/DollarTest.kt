package tdd.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class DollarTest : StringSpec({
    "tstMultiplication" {
        val five = Dollar(5)
        five.times(2)
        five.amount shouldBe 10
    }
})

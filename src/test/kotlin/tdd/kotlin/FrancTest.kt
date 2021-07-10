package tdd.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FrancTest : StringSpec({
    "testMultiplication" {
        val five = Franc(5)
        five.times(2) shouldBe Franc(10)
        five.times(3) shouldBe Franc(15)
    }
})

package tdd.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FrancTest : StringSpec({
    "testMultiplication" {
        val five = Money.franc(5)
        five.times(2) shouldBe Money.franc(10)
        five.times(3) shouldBe Money.franc(15)
    }
})

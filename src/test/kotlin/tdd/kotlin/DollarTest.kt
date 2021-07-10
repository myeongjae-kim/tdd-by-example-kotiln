package tdd.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class DollarTest : StringSpec({
    "testMultiplication" {
        val five = Dollar(5)
        five.times(2) shouldBe Dollar(10)
        five.times(3) shouldBe Dollar(15)
    }

    "testEquality" {
        (Dollar(5) == Dollar(5)) shouldBe true
        (Dollar(5) == Dollar(6)) shouldBe false
    }
})

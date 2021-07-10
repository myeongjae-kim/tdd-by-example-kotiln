package tdd.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class DollarTest : StringSpec({
    "testMultiplication" {
        val five: Money = Money.dollar(5)
        five.times(2) shouldBe Money.dollar(10)
        five.times(3) shouldBe Money.dollar(15)
    }
})

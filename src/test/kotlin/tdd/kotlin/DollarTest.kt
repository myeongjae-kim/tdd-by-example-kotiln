package tdd.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class DollarTest : StringSpec({
    "testMultiplication" {
        val five = Dollar(5)
        var product = five.times(2)
        product.amount shouldBe 10
        product = five.times(3)
        product.amount shouldBe 15
    }

    "testEquality" {
        (Dollar(5) == Dollar(5)) shouldBe true
        (Dollar(5) == Dollar(6)) shouldBe false
    }
})

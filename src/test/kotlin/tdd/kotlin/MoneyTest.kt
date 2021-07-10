package tdd.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MoneyTest: StringSpec({

    "testEquality" {
        (Money(5) == Money(5)) shouldBe true
        (Money(5) == Money(6)) shouldBe false
    }
})

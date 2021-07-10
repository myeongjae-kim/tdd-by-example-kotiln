package tdd.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MoneyTest: StringSpec({

    "testEquality" {
        (Money.dollar(5) == Money.franc(5)) shouldBe false
    }
})

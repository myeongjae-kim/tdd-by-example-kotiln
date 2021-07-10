package tdd.kotlin

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MoneyTest: StringSpec({

    "testMultiplication" {
        val five: Money = Money.franc(5)
        five.times(2) shouldBe Money.franc(10)
        five.times(3) shouldBe Money.franc(15)
    }

    "testEquality" {
        (Money.dollar(5) == Money.dollar(5)) shouldBe true
        (Money.dollar(5) == Money.dollar(6)) shouldBe false
        (Money.dollar(5) == Money.franc(5)) shouldBe false
    }

    "testCurrency" {
        Money.dollar(1).currency() shouldBe "USD"
        Money.franc(1).currency() shouldBe "CHF"
    }

    "testSimpleAddition" {
        val five = Money.dollar(5)
        val sum: Expression = five.plus(five)
        val bank: Bank = Bank()
        val reduced: Money = bank.reduce(sum, "USD")
        reduced shouldBe Money.dollar(10)
    }
})

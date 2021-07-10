package tdd.kotlin

class Franc(amount: Int, currency: String): Money(amount, currency) {

    override fun times(multiplier: Int): Money = Franc(amount * multiplier, currency)
    override fun currency(): String = currency
}

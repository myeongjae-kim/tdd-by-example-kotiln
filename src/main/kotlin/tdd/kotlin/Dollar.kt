package tdd.kotlin

class Dollar(amount: Int, curreny: String): Money(amount, curreny) {

    override fun times(multiplier: Int): Money = Dollar(amount * multiplier, currency)
    override fun currency(): String = currency
}

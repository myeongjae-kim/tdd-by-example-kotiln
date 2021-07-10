package tdd.kotlin

class Dollar(amount: Int): Money(amount) {

    override fun times(multiplier: Int): Money = Dollar(amount * multiplier)
}

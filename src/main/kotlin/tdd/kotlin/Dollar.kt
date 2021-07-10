package tdd.kotlin

class Dollar(
    private var amount: Int
) {

    fun times(multiplier: Int) = Dollar(amount * multiplier)

    override fun equals(other: Any?) = (other as Dollar?)?.amount == amount
}

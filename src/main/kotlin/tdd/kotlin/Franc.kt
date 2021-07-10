package tdd.kotlin

class Franc(
    private var amount: Int
) {

    fun times(multiplier: Int) = Franc(amount * multiplier)

    override fun equals(other: Any?) = (other as Franc?)?.amount == amount
}

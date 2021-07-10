package tdd.kotlin

class Money(
    private val amount: Int,
    private val currency: String,
): Expression {

    override fun equals(other: Any?): Boolean {
        val money = other as Money?
        return money?.amount == amount && money.currency == currency
    }

    fun times(multiplier: Int): Money = Money(amount * multiplier, currency)
    fun currency(): String = currency
    fun plus(addend: Money): Expression = Money(amount + addend.amount, currency)

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }
}

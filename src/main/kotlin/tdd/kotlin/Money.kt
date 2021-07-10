package tdd.kotlin

class Money(
    val amount: Int,
    private val currency: String,
): Expression {

    override fun equals(other: Any?): Boolean {
        val money = other as Money?
        return money?.amount == amount && money.currency == currency
    }

    fun times(multiplier: Int): Expression = Money(amount * multiplier, currency)
    fun currency(): String = currency
    override fun plus(addend: Expression): Expression = Sum(this, addend)
    override fun reduce(bank: Bank, to: String): Money {
        val rate: Int = bank.rate(currency, to)
        return Money(amount / rate, to)
    }

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }
}

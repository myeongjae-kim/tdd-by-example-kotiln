package tdd.kotlin

interface Expression {
    fun reduce(bank: Bank, to: String): Money
}

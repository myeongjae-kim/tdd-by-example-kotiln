package tdd.kotlin

class Bank {
    fun reduce(source: Expression, to: String): Money = source.reduce(to)
}

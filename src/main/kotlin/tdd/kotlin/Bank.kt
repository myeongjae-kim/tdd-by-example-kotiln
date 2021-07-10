package tdd.kotlin

import kotlin.collections.HashMap

class Bank {
    private class Pair(private val from: String, private val to: String) {
        override fun equals(other: Any?): Boolean {
            val pair = other as Pair?
            return from == pair?.from && to == pair.to
        }

        override fun hashCode(): Int {
            return 0
        }
    }

    private val rates: MutableMap<Pair, Int> = HashMap()

    fun reduce(source: Expression, to: String): Money = source.reduce(this, to)
    fun rate(from: String, to: String): Int = if (from == to) 1 else rates.getValue(Pair(from, to))
    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }
}

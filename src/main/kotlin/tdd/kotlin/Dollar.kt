package tdd.kotlin

class Dollar(
    amount: Int
) {
    var amount: Int = amount
        private set

    fun times(multiplier: Int) {
        amount *= multiplier
    }
}

package ru.sagutdinov.percent

fun main() {
    //стоимость продаж
    //пример <1000
    var amount = 100f
    var total = 21f
    var fee: Float = calculateFee(amount, total, true)
    println("Сумма за вычетом налога = ${amount - fee}.Ваш налог составляет $fee");
    fee = calculateFee(amount, total, false)
    println("Сумма за вычетом налога = ${amount - fee}.Ваш налог составляет $fee");
    //пример >1000
    amount = 100f
    total = 1001f
    fee = calculateFee(amount, total, true)
    println("Сумма за вычетом налога = ${amount - fee}.Ваш налог составляет $fee");
    fee = calculateFee(amount, total, false)
    println("Сумма за вычетом налога = ${amount - fee}.Ваш налог составляет $fee");
    //пример >10000
    amount = 200f
    total = 10001f
    fee = calculateFee(amount, total, true)
    println("Сумма за вычетом налога = ${amount - fee}.Ваш налог составляет $fee");
    fee = calculateFee(amount, total, false)
    println("Сумма за вычетом налога = ${amount - fee}.Ваш налог составляет $fee");
    //пример >50000
    amount = 300f
    total = 50001f
    fee = calculateFee(amount, total, true)
    println("Сумма за вычетом налога = ${amount - fee}.Ваш налог составляет $fee");
    fee = calculateFee(amount, total, false)
    println("Сумма за вычетом налога = ${amount - fee}.Ваш налог составляет $fee");
}

fun calculateFee(amount: Float, total: Float, exclusive: Boolean): Float {
    val exclusiveSale: Float = if (exclusive) 0.05f else 0f
    return (when {
        total > 50000 -> amount * (0.15 - exclusiveSale)
        total > 10000 -> amount * (0.2 - exclusiveSale)
        total > 1000 -> amount * (0.25 - exclusiveSale)
        else -> amount * (0.30 - exclusiveSale)
    }).toFloat()
}
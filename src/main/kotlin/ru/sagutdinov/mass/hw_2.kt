package ru.sagutdinov.mass

import kotlin.math.pow

fun main() {
    val mass = 62f;
    val height = 1.77f;
    massIndexPrint(mass, height)

}

fun massIndexPrint(mass: Float, height: Float) {
    val massIndex: Double = mass / height.toDouble().pow(2.0)
    when {
        massIndex >= 40 -> print("Очень резкое ожирение")
        massIndex >= 35 && massIndex < 40 -> print("Ожирение резкое")
        massIndex >= 30 && massIndex < 35 -> print("Ожирение")
        massIndex >= 25 && massIndex < 30 -> print("Избыточная масса тела (предожирение)")
        massIndex >= 18.5 && massIndex < 25 -> print("Норма")
        massIndex >= 16 && massIndex < 18.5 -> print("Недостаточная (дефицит) масса тела")
        massIndex < 16 -> print("Выраженный дефицит массы тела")
    }
}
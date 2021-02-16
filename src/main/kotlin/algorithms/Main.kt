package algorithms

import algorithms.matrix.identityMatrix
import algorithms.matrix.matrixOf

fun main() {
    println("empty list is ${listOf<Int>()}, isEmpty = ${listOf<Int>().isEmpty()}")
    val list = listOf(1,2,3,4,5,6,7,8,8,9,10)
    println(binarySearch(list, 3))
    val name = "Ilya"
    val status = "is programming"

    println(identityMatrix(4, 6))
    println(matrixOf(4, 6, 4.0) + matrixOf(4, 6, 5.0))
    println(matrixOf())
    println(matrixOf( 4 , value = 5.0))

}


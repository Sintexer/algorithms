package algorithms.matrix

import algorithms.matrix.exception.MatrixConformityException

class Matrix(val rows: Int, val cols: Int, val content: List<List<Double>>) {

    operator fun get(index: Int): List<Double> {
        return content[index];
    }

    override fun toString(): String {
        return if(content.isEmpty()) "[empty]" else content.joinToString("\n")
    }

    operator fun plus(matrix: Matrix): Matrix {
        if(rows != matrix.rows || cols != matrix.cols) throw MatrixConformityException()
        return matrixOf(content.mapIndexed{i, row ->
            row.mapIndexed { j, value ->
                this[i][j] + matrix[i][j]
            }
        })
    }

}
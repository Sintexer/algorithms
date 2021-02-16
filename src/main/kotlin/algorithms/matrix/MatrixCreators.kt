package algorithms.matrix

fun matrixOf(rows: Int = 0, cols: Int = rows, value: Double = 0.0): Matrix{
    return Matrix(rows,cols, createFilledBody(rows, cols, value))
}

fun matrixOf(content: List<List<Double>>): Matrix{
    return Matrix(content.size, content.first().size, content)
}

fun  zeroMatrix(rows: Int, cols: Int = rows): Matrix{
    return Matrix(rows, cols, createFilledBody(rows, cols, 0.0))
}

fun identityMatrix(rows: Int, cols: Int = rows): Matrix{
    return Matrix(rows, cols, List(rows){List(cols){0.0}}.mapIndexed{rowIndex, row ->
        row.mapIndexed{colIndex, _ ->
            if(rowIndex == colIndex) 1.0 else 0.0
        }
    })
}

private fun createFilledBody(rows: Int, cols: Int, value: Double): List<List<Double>>{
    return List(rows){ List(cols){ value} }
}
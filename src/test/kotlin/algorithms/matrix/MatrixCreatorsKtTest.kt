package algorithms.matrix

import io.kotlintest.forAll
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

open class MatrixCreatorsKtTest: StringSpec({
    "zero matrix test" {
        val matrix = zeroMatrix(5, 5)
        forAll(matrix.content){
            it.forEach{it shouldBe 0.0}
        }
    }
    "empty matrix test"{
        val matrix = matrixOf()
        matrix.content.isEmpty() shouldBe true
    }
    "identity matrix test"{
        val matrix = identityMatrix(8, 10)
        matrix.content.forEachIndexed{ rowIndex, row ->
            row.forEachIndexed{ colIndex, element ->
                matrix.content[rowIndex][colIndex] shouldBe if(rowIndex == colIndex) 1.0 else 0.0
            }
        }
    }
})
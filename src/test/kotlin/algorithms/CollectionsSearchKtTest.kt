package algorithms

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.FreeSpec
import io.kotlintest.tables.row


open class CollectionsSearchKtTest: FreeSpec() {

    init {
        "Search. Data driven case" - {

            //region Values
            val list = listOf(1..100).flatten()
            //endregion

            "correct index by value"{
                forall (
                    row(1,0),
                    row(5,4),
                    row(-1,-1),
                    row(99,98),
                    row(101,-1)
                    ) { element, expected ->
                    binarySearch(list, element) shouldBe expected
                }
            }
        }
    }

}
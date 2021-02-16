package algorithms

fun <T: Comparable<T>> binarySearch(list: List<T>, value: T): Int {
    var left = 0;
    var right = list.size - 1;
    while (left <= right) {
        val index = (left+right)/2;
        when {
            list[index] == value -> return index
            list[index] > value -> right = index-1
            list[index] < value -> left = index+1
        }
    }
    return -1
}
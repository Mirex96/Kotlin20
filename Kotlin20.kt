// 13. На вход поступают два массива, возвращается третий, который составлен из элементов,
// которые содержатся в первом и во втором массиве
fun main() {
    val array1 = arrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf(6, 7, 8, 9, 10)
    println(array3(array1, array2).contentToString())
}

fun array3(array1: Array<Int>, array2: Array<Int>): Array<Int> {
    return array1 + array2
}
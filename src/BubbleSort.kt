fun main(args: Array<String>){
    val array = arrayOf(1,3,2,5,8,6,9,4)
//    printArray(array)
    myVersionBubbleSort(array)
//    printArray(array)
}

fun bubbleSort(a: Array<Int>) {
    val n = a.size
    (1 until n).map {
        for (j in 0..n - 1 - it) {
            if (a[j] > a[j + 1]) {
                val max = a[j]
                a[j] = a[j + 1]
                a[j + 1] = max
            }
        }

    }


}

fun myVersionBubbleSort(a:Array<Int>){
    val n = a.size
    for (i in 1 until n){
        for (j in 0..n-1-i){
            if (a[j] > a[j + 1]){
                val max = a[j]
                a[j] = a[j + 1]
                a[j + 1] = max
            }
        }
    }
}

fun printArray(array: IntArray){
    println("")
    for(i in array.indices){
        print("${array[i]}, ")
    }
}

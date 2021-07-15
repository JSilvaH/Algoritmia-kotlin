fun main(args:Array<String>){
    val array = arrayOf(1,2,6,9,11,15,29,35,38,40,47,90,95)
    println(binarySearch(array, 9))
}

fun binarySearch(ar: Array<Int>, value:Int):String{
    var low = 0
    var high = ar.size - 1
    while (low <= high){
        val mid = (low + high) / 2
        when {
            ar[mid] == value -> {
                return "$value is in the array"
            }
            ar[mid] < value -> {
                low = mid +1
            }
            else -> {
                high = mid - 1
            }
        }
    }
    return "$value is not in the array"

}
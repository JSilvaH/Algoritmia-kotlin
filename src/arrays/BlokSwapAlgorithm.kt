package arrays

fun main(args: Array<String>){
    val ar = arrayOf(1, 2, 3, 4, 5 ,6, 7, 8)
    val rotate = 2
    val n = ar.size
    leftRotate(ar,rotate, n)
    printArray(ar)
}


fun leftRotate(array: Array<Int>, rotate: Int, size:Int){
    leftRotateRec(array, 0, rotate, size)
}

fun leftRotateRec(array: Array<Int>, i: Int, rotate: Int, size: Int) {

    if (rotate == 0 || rotate == size) return

    //if number  of elements to be rotated  is exactly half  of array size
    if(size - rotate == rotate){
        swapElement(array, i, size - rotate + i , rotate)
    }

    //if A is shorter

    if (rotate < size - rotate){
        swapElement(array, i , size - rotate + i , size)
        leftRotateRec(array, i , rotate, size - rotate)
    }else {
        swapElement(array, i , rotate , size - rotate)
        leftRotateRec(array, size - rotate + i , 2 * rotate - size, rotate)
    }

}

fun swapElement(array: Array<Int>, fi: Int, si: Int, rotate: Int) {
    var temp = 0
    for(i in 0 until rotate){
        temp = array[fi + i]
        array[fi + i] = array[si + i]
        array[si + i] = temp

    }
}

fun printArray(array: Array<Int>){
    for(item in array){
        print("$item, ")
    }
}

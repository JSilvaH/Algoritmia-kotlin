fun main(args: Array<String>){
    //make a function to rotate (ar[], d, n) that rotates arr[] of size n by d elements
    /*
    * input
    * [1,2,3,4,5,6,7]
    * the rotation by 2 the array will be
    * output
    * [3,4,5,6,7,1,2]
    *
    *
    * */
    val myArray = arrayOf(1,2,3,4,5,6,7)
    val rotation = 1
//    println(method1(myArray, rotation, myArray.size))
//    println(method2(myArray, rotation, myArray.size))
    method4(myArray,rotation, myArray.size)
    printArray(myArray)
}

fun method1(array: Array<Int>, rotation: Int, size:Int): List<Int>{
    //In this method I will use  temps array
    val arrayTemp = array.slice(0 until rotation)
    val myNewArray  = array.slice(rotation until size)
    return myNewArray + arrayTemp
}

///utils/////
fun printArray(array: Array<Int>){
    for(i in array){
        print("$i , ")
    }
}



///////////////////////////////////////////////////////////////////////////
fun method2(array: Array<Int>,rotation: Int, size: Int) : List<Int>{
    //rotate one by one
    for (i in 0 until rotation)
        leftRotateByOne(array, size)

    return array.toList()

}

fun leftRotateByOne(array: Array<Int>, size:Int){
    val temp = array[0]
    for (i in 0 until size - 1)
        array[i] = array[i + 1]
    array[size - 1] = temp
}
//////////////////////////////////////////////////////////////////////////////
fun method3(){
    ///this method is called the juggling method
}


//////////////////////////////////////////////////////////////////////////////

fun method4(array: Array<Int>, rotation: Int, size: Int){
    //the reversal Algorithm
    if (rotation == 0)
        return

    var localRotation = rotation
    localRotation %= size
    reverseArray(array, 0, localRotation - 1)
    reverseArray(array, localRotation,size - 1 )
    reverseArray(array, 0, size - 1)

}


fun reverseArray(array: Array<Int>,start:Int, end:Int){
    var temp = 0
    var localStar = start
    var localEnd = end
    while (localStar < localEnd){
        temp  = array[localStar]
        array[localStar]= array[localEnd]
        array[localEnd] = temp
        localStar++
        localEnd--

    }
}

///////////////////////////////////////////////////////////////
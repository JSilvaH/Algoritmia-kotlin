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
    val rotation = 4
//    println(method1(myArray, rotation, myArray.size))
    println(method2(myArray, rotation, myArray.size))
}

fun method1(array: Array<Int>, rotation: Int, size:Int): List<Int>{
    //In this method I will use  temps array
    val arrayTemp = array.slice(0 until rotation)
    val myNewArray  = array.slice(rotation until size)
    return myNewArray + arrayTemp
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
fun method(){
    ///this method is called the juggling method
}


//////
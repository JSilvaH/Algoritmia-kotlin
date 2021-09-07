package linkedList

fun main(){
   //proving mutablelist
    val list: MutableCollection<Int> = LinkedList()

    list.add(3)
    list.add(2)
    list.add(1)
    println(list)
    list.remove(1)
    println(list)

    //retaining elements
    list.add(1)
    list.add(5)
    list.add(4)
    println(list)

    list.retainAll(listOf(1,2,5))
    println(list)

    //remove all elements
    list.removeAll(listOf(1,4))
    println(list)

}



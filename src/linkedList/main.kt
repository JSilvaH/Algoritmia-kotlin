package linkedList

fun main(){
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("List before inserting : $list")
    var middleNode = list.nodeAt(1)!!
    for (i in 1..3){
        middleNode = list.insert(-1 * i, middleNode)
    }
    println("List after inserting: $list")
    list.pop()
    println("List after pop $list")
    list.removeLast()
    println("List after removed last item $list")



    /////////
    val index = 1
    val node = list.nodeAt(index - 1)!!
    val removedValue = list.removeAfter(node)
    println("After removing at index $index: $list")
    println("The value removed was: $removedValue")

}

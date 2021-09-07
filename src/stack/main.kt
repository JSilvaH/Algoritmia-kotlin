package stack

fun main(){
//    val stack = StackImpl<Int>().apply {
//        push(1)
//        push(2)
//        push(3)
//        push(4)
//    }
//
//    print(stack)
//    val poppedElement = stack.pop()
//    if (poppedElement != null) {
//        println("Popped: $poppedElement")
//    }
//
//    println(stack)

//    val list = listOf("A", "B", "C", "D")
//    val stack = StackImpl.create(list)
//    print(stack)
//    //pop
//    val popped = stack.pop()
//    println("Popped element: $popped")
//    print(stack)

    //the parentheses validation
    val myWord = "(hol)(a)(pepe"
    println("My phrase is balanced? answer = ${myWord.checkParentheses()} ")

}
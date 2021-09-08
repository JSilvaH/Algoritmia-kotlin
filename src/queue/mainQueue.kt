package queue

fun main(){
    val queue = ArrayListQueue<String>().apply {
        enqueue("A")
        enqueue("B")
        enqueue("C")
        enqueue("D")
    }
    println(queue)
    queue.dequeue()
    println(queue)
    println("Next up : ${queue.peek()}")
}
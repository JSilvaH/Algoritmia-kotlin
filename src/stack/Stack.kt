package stack

import javax.lang.model.util.Elements

interface Stack <Element>{
    fun push(element: Element)
    fun pop(): Element?
    fun peek(): Element?
    val count: Int
    val isEmpty: Boolean
        get() = count == 0
}

class StackImpl<T : Any>():Stack<T> {
    private val storage = arrayListOf<T>()

    companion object{
        fun <Element : Any> create(items: Iterable<Element>):
                Stack<Element>{
                    val stack = StackImpl<Element>()
                    for (item in items){
                        stack.push(item)
                    }
                    return stack
                }
    }

    override fun toString() = buildString {
        appendLine("----top-----")
        storage.asReversed().forEach{
            appendLine("$it")
        }
        appendLine("-----------")
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (isEmpty){
            return null
        }
        return storage.removeAt(count - 1)
    }

    override fun peek(): T? {
       return  storage.lastOrNull()
    }

    override val count: Int
        get() = storage.size

}

//the parentheses validation

fun String.checkParentheses():Boolean{
    val stack = StackImpl<Char>()

    for (character in this){
        when(character){
            '(' -> stack.push(character)
            ')' -> if (stack.isEmpty){
                return false
            }else{
                stack.pop()
            }
        }
    }
    return stack.isEmpty
}